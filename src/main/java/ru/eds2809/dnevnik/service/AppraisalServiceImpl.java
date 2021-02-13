package ru.eds2809.dnevnik.service;

import org.springframework.stereotype.Service;
import ru.eds2809.dnevnik.models.Appraisal;
import ru.eds2809.dnevnik.repositories.AppraisalRepository;
import ru.eds2809.dnevnik.repositories.SubjectRepository;

import java.util.Date;
import java.util.List;

@Service
public class AppraisalServiceImpl implements AppraisalService {

    private final AppraisalRepository appraisalRepository;
    private final SubjectRepository subjectRepository;

    public AppraisalServiceImpl(AppraisalRepository appraisalRepository, SubjectRepository subjectRepository) {
        this.appraisalRepository = appraisalRepository;
        this.subjectRepository = subjectRepository;
    }

    @Override
    public List<Appraisal> findAllAppraisalByUserIdAndSubjectId(long userId, long subjectId) {
        return appraisalRepository.findAllByUserIdAndSubjectId(userId, subjectId);
    }

    @Override
    public Appraisal save(Appraisal appraisal) {
        if (appraisal.getScore() < 2 || appraisal.getScore() > 5) {
            throw new RuntimeException("");
        }

        if (appraisal.getSubjectId() <= 0) {
            throw new RuntimeException("");
        }

        if (appraisal.getUserId() <= 0) {
            throw new RuntimeException("");
        }

        appraisal.setEvaluationDate(new Date());
        appraisal.setUpdateDate(new Date());

        return appraisalRepository.save(appraisal);
    }

    @Override
    public boolean delete(long appraisalId) {
        try {
            appraisalRepository.deleteById(appraisalId);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
