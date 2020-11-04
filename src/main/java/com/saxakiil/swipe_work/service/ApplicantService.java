package com.saxakiil.swipe_work.service;

import com.saxakiil.swipe_work.model.Applicant;
import com.saxakiil.swipe_work.repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicantService {

    private final ApplicantRepository applicantRepository;

    @Autowired
    public ApplicantService(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    public Applicant findById(Long id) {
        return applicantRepository.getOne(id);
    }

    public Applicant saveApplicant(Applicant applicant) {
        return applicantRepository.save(applicant);
    }

    public void deleteById(Long id) {
        applicantRepository.deleteById(id);
    }
}
