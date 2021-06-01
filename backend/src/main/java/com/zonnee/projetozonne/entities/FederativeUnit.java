package com.zonnee.projetozonne.entities;

import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_federativeUnits")
public class FederativeUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFederativeUnit;
    private String name;
    private String prefix;

    @OneToMany(mappedBy = "idFederativeUnit", fetch = FetchType.EAGER)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Dealership> dealerships = new ArrayList<>();


}
