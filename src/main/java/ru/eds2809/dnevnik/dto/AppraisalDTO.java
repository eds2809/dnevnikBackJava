package ru.eds2809.dnevnik.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class AppraisalDTO {
    private Long id;
    private Long subjectId;
    private Long userId;
    private Long score;
    private String evaluationDateString;
    private Date updateDate;
}
