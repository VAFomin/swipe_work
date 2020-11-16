package com.saxakiil.swipe_work.rest;

import com.saxakiil.swipe_work.model.Applicant;
import com.saxakiil.swipe_work.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/applicants")
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    @GetMapping("/getApplicant")
    public Applicant getApplicant(@RequestParam Long id) {
        return applicantService.findById(id);
    }
}
