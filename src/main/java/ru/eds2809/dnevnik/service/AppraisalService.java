package ru.eds2809.dnevnik.service;

import ru.eds2809.dnevnik.models.Appraisal;

import java.util.List;

public interface AppraisalService {
    List<Appraisal> findAllAppraisalByUserIdAndSubjectId(long userId, long subjectId);

    Appraisal save(Appraisal appraisal);

    boolean delete(long appraisalId);
}
