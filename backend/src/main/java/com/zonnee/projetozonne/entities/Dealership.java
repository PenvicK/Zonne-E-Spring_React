package com.zonnee.projetozonne.entities;

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

    @ManyToOne
    @JoinColumn(name = "idFederativeUnit")
    private FederativeUnit idFederativeUnit;

}
