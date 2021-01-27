package ru.eds2809.dnevnik.service;

import ru.eds2809.dnevnik.models.Appraisal;
import ru.eds2809.dnevnik.models.Subject;

import java.util.List;

public interface AppraisalService {
    List<Subject> findAllAppraisalByPupilId(Long pupilId);

    Appraisal save(Appraisal appraisal);

    void delete(long appraisalId);
}
