package tn.esprit.springfirst.springfirst.entities;

import jakarta.persistence.*;

@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numRegistration")
    private Long id;

    @Column(name = "numWeek")
    private int numWeek;

    @ManyToOne
    Skier skier;
}
