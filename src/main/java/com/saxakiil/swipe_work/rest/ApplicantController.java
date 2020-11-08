package com.saxakiil.swipe_work.rest;

import com.saxakiil.swipe_work.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/applicants/")
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

}
