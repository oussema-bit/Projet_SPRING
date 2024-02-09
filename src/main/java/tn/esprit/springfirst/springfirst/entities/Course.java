package tn.esprit.springfirst.springfirst.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private Long id;
}
