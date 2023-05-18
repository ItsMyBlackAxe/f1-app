package com.wavenent.f1app.driver;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name = "drivers")
@Getter
@Setter
public class Driver {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String team;

    @Column
    private String country;

    @Column
    private int points;

    @Column
    private int ranking;


}
