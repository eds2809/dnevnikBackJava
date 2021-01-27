package ru.eds2809.dnevnik.service;

import org.springframework.stereotype.Service;
import ru.eds2809.dnevnik.models.Appraisal;
import ru.eds2809.dnevnik.models.Subject;
import ru.eds2809.dnevnik.repositories.AppraisalRepository;
import ru.eds2809.dnevnik.repositories.SubjectRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AppraisalServiceImpl implements AppraisalService{

    private final AppraisalRepository appraisalRepository;
    private final SubjectRepository subjectRepository;

    public AppraisalServiceImpl(AppraisalRepository appraisalRepository, SubjectRepository subjectRepository) {
        this.appraisalRepository = appraisalRepository;
        this.subjectRepository = subjectRepository;
    }

    @Override
    public List<Subject> findAllAppraisalByPupilId(Long pupilId) {
        List<Appraisal> appraisalList = appraisalRepository.findAllByPupilId(pupilId);
        List<Subject> subjectList = (List<Subject>) subjectRepository.findAll();

        Map<Long, Subject> subjectMap = new HashMap<>();

        for (Subject subject : subjectList){
            subjectMap.put(subject.getId(), subject);
        }


        Map<Subject, List<Appraisal>> subjectListMap = new HashMap<>();
        for (Appraisal appraisal : appraisalList){
            Subject subject = subjectMap.get(appraisal.getSubjectId());
            if (!subjectListMap.containsKey(subject)) {
                subjectListMap.put(subject, new ArrayList<>());
            }
            if (subject.getId() == appraisal.getSubjectId()){
                subjectListMap.get(subject).add(appraisal);
            }
        }

        List<Subject> subjects = new ArrayList<>();

        subjectListMap.forEach((k,v) ->{
            k.setAppraisals(v);
            subjects.add(k);
        });

        return subjects;
    }

    @Override
    public Appraisal save(Appraisal appraisal) {
        if (appraisal.getScore() < 2 || appraisal.getScore() > 5){
            throw new RuntimeException("");
        }

        if (appraisal.getSubjectId() <= 0){
            throw new RuntimeException("");
        }

        if (appraisal.getPupilId() <= 0){
            throw new RuntimeException("");
        }

        return appraisalRepository.save(appraisal);
    }

    @Override
    public void delete(long appraisalId) {
        try {
            appraisalRepository.deleteById(appraisalId);
        } catch (Exception e){
        }
    }
}
