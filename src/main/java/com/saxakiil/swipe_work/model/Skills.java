package com.saxakiil.swipe_work.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="skills_table")
@Data
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "skill")
    private String skill;
}
