package ru.eds2809.dnevnik.converterToDTO;

import ru.eds2809.dnevnik.dto.SubjectDTO;
import ru.eds2809.dnevnik.models.Subject;

import java.util.ArrayList;
import java.util.List;

public class ConverterToDTO {
    public static List<SubjectDTO> convertSubjectList(List<Subject> subjects){
        List<SubjectDTO> list = new ArrayList<>();
        for(Subject s : subjects){
            list.add(new SubjectDTO(s));
        }

        return list;
    }
}
