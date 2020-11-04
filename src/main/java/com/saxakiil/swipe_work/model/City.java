package com.saxakiil.swipe_work.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="city_table")
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "city")
    private String city;

}
