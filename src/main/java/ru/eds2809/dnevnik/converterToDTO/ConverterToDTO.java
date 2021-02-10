package ru.eds2809.dnevnik.converterToDTO;

import ru.eds2809.dnevnik.dto.AppraisalDTO;
import ru.eds2809.dnevnik.models.Appraisal;
import ru.eds2809.dnevnik.utils.Utils;

import java.util.List;
import java.util.stream.Collectors;

public class ConverterToDTO {

    public static List<AppraisalDTO> toAppraisalDTO(List<Appraisal> appraisalList) {
        return appraisalList.stream()
                .map(appraisal -> AppraisalDTO.builder()
                        .id(appraisal.getId())
                        .score(appraisal.getScore())
                        .updateDate(appraisal.getUpdateDate())
                        .evaluationDateString(Utils.convertDate(appraisal.getEvaluationDate()))
                        .subjectId(appraisal.getSubjectId())
                        .userId(appraisal.getUserId())
                        .build())
                .collect(Collectors.toList());
    }
}
