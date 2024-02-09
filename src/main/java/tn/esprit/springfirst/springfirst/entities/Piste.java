package tn.esprit.springfirst.springfirst.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity

public class Piste implements Serializable {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPiste")
    private Long id;

    @Column(name = "namePiste")
    private String namePiste;

    @Enumerated(EnumType.STRING)
    private Color color;
    @Column(name = "length")

    private int length;
    @Column(name = "slope")

    private int slope;

    @ManyToMany(mappedBy = "pistes")
    private Set<Skier> skiers;


}
