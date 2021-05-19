package com.zonnee.projetozonne.entities;

import javax.persistence.*;

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

    public Dealership(Long idDealership, String name, FederativeUnit idFederativeUnit){
        this.setIdDealership(idDealership);
        this.setName(name);
        this.setIdFederativeUnit(idFederativeUnit);
    }

    public Dealership(){

    }

    public void statusDealership(){
        System.out.println("======================================");
        System.out.println("            Concessionária            ");
        System.out.println("======================================");
        System.out.println("Id: " + this.getIdDealership());
        System.out.println("Nome: " + this.getName());
        System.out.println("Estado: " + this.idFederativeUnit.getName());
        System.out.println("======================================");
    }

    public Long getIdDealership() {
        return idDealership;
    }

    public void setIdDealership(Long idDealership) {
        this.idDealership = idDealership;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FederativeUnit getIdFederativeUnit() {
        return idFederativeUnit;
    }

    public void setIdFederativeUnit(FederativeUnit idFederativeUnit) {
        this.idFederativeUnit = idFederativeUnit;
    }
}
