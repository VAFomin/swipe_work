package com.saxakiil.swipe_work.rest;

import com.saxakiil.swipe_work.model.Vacation;
import com.saxakiil.swipe_work.service.VacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/vacation")
public class VacationController {

    @Autowired
    private VacationService vacationService;

    @GetMapping("/getPullVacation")
    public List<Vacation> getPullVacation(@RequestParam Integer countVacation) {
        return vacationService.getPullVacation(countVacation);
    }
}
