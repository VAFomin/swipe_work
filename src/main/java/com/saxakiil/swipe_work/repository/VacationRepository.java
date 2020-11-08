package com.saxakiil.swipe_work.repository;

import com.saxakiil.swipe_work.model.Vacation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacationRepository extends JpaRepository<Vacation, Long> {
}
