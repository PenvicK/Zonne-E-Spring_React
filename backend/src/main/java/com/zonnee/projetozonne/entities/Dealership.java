package com.zonnee.projetozonne.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_dealerships")
public class Dealership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDealership;
    private String name;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idFederativeUnit")
    private FederativeUnit idFederativeUnit;

}
