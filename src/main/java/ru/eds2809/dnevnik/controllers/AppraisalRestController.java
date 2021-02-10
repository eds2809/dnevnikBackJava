package ru.eds2809.dnevnik.controllers;


import org.springframework.web.bind.annotation.*;
import ru.eds2809.dnevnik.converterToDTO.ConverterToDTO;
import ru.eds2809.dnevnik.dto.AppraisalDTO;
import ru.eds2809.dnevnik.models.Appraisal;
import ru.eds2809.dnevnik.service.AppraisalService;

import java.util.List;

@RestController
@RequestMapping("appraisal")
public class AppraisalRestController {
    private final AppraisalService appraisalService;

    public AppraisalRestController(AppraisalService appraisalService) {
        this.appraisalService = appraisalService;
    }


    @PutMapping("/")
    public Appraisal saveAppraisal(@RequestBody Appraisal appraisal) {
        return appraisalService.save(appraisal);
    }

    @DeleteMapping("/{appraisalId}")
    public void deleteAppraisal(@PathVariable long appraisalId){
        appraisalService.delete(appraisalId);
    }

    @GetMapping("/{userid}/{subjectId}")
    public List<AppraisalDTO> getAllAppraisalByUserIdAndSubjectId(@PathVariable long userid, @PathVariable long subjectId){
        return ConverterToDTO.toAppraisalDTO(appraisalService.findAllAppraisalByUserIdAndSubjectId(userid,subjectId));
    }
}
