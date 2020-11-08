package com.saxakiil.swipe_work.service;

import com.saxakiil.swipe_work.model.Vacation;
import com.saxakiil.swipe_work.repository.VacationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VacationService {

    private final VacationRepository vacationRepository;

    @Autowired
    public VacationService(VacationRepository vacationRepository) {
        this.vacationRepository = vacationRepository;
    }

    public Vacation findById(Long id) {

        return vacationRepository.getOne(id);
    }

    public Vacation saveVacation(Vacation vacation) {
        return vacationRepository.save(vacation);
    }

    public void deleteById(Long id) {
        vacationRepository.deleteById(id);
    }

    public List<Vacation> getPullVacation(Integer countVacation) {
        return this.vacationRepository.findAll().stream().limit(countVacation).collect(Collectors.toList());
    }
}
