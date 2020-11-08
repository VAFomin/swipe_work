package com.saxakiil.swipe_work.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="company")
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name_company")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "photo")
    private String photo;
}
