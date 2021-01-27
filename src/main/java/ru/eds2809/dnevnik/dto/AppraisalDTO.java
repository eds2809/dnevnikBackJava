package ru.eds2809.dnevnik.dto;

import ru.eds2809.dnevnik.models.Appraisal;

public class AppraisalDTO {
    private long id;
    private long score;


    public AppraisalDTO(Appraisal appraisal) {
        this.id = appraisal.getId();
        this.score = appraisal.getScore();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }
}
