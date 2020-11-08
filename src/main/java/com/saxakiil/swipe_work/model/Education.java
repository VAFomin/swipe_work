package com.saxakiil.swipe_work.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="education_table")
@Data
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "institution")
    private String institution;
}
