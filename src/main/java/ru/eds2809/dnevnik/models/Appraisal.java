package ru.eds2809.dnevnik.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Appraisal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private long subjectId;
    private long pupilId;
    private long score;

    public Appraisal() {

    }

    public Appraisal(int score) {
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(long subjectId) {
        this.subjectId = subjectId;
    }

    public long getPupilId() {
        return pupilId;
    }

    public void setPupilId(long pupilId) {
        this.pupilId = pupilId;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }
}
