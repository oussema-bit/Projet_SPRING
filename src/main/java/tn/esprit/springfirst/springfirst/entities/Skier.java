package tn.esprit.springfirst.springfirst.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Skier implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numSkier")
    private Long id;
    @Column(name = "fisrtName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "dateOfBirth")
    private Date dateOfBirth;
    @Column(name = "city")
    private String city;

    @ManyToMany
    @JoinTable(
            name = "pistes_skier",
            joinColumns = @JoinColumn(name = "numSkier"),
            inverseJoinColumns = @JoinColumn(name = "idPiste")
    )
    private Set<Piste> pistes;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "skier")
    private Set<Registration> registrations;


}
