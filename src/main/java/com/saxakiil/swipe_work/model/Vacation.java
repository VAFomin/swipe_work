package com.saxakiil.swipe_work.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="vacation")
@Data
public class Vacation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id")
    private City city;

    @Column(name = "salary")
    private Integer salary;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "experience_id")
    private Experience experience;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "employment_id")
    private Employment employment;

    @Column(name = "duty")
    private String duty;

    @Column(name = "conditions")
    private String conditions;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "required_skills_vacation_table",
            joinColumns = @JoinColumn(name = "id_vacation"),
            inverseJoinColumns = @JoinColumn(name = "id_skill")
    )
    private Collection<Skills> skills;
}
