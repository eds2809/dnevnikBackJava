package ru.eds2809.dnevnik.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Appraisal {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private Long subjectId;
    @Column(nullable = false)
    private Long userId;
    @Column(nullable = false)
    private Long score;
    @Column(updatable = false, nullable = false)
    @JsonIgnore
    private Date evaluationDate;
    @JsonIgnore
    private Date updateDate;
}
