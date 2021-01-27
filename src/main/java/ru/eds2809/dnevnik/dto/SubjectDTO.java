package ru.eds2809.dnevnik.dto;

import ru.eds2809.dnevnik.models.Appraisal;
import ru.eds2809.dnevnik.models.Subject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SubjectDTO {
    private String name;
    private List<AppraisalDTO> appraisals = new ArrayList<>();

    public SubjectDTO(Subject subject) {
        this.name = subject.getName();
        for (Appraisal a : subject.getAppraisals()) {
            appraisals.add(new AppraisalDTO(a));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AppraisalDTO> getAppraisals() {
        return appraisals;
    }

    public void setAppraisals(List<AppraisalDTO> appraisals) {
        this.appraisals = appraisals;
    }
}
