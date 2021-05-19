package com.zonnee.projetozonne.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_federativeUnits")
public class FederativeUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFederativeUnit;
    private String name;
    private String prefix;

    @OneToMany(mappedBy = "idFederativeUnit")
    private List<Dealership> dealerships = new ArrayList<>();
 //   private List<Address> adresses = new ArrayList<>();

    public FederativeUnit(){

    }

    public FederativeUnit(Long idFederativeUnit, String name, String prefix){
        this.setIdFederativeUnit(idFederativeUnit);
        this.setName(name);
        this.setPrefix(prefix);
    }

    public Long getIdFederativeUnit() {
        return idFederativeUnit;
    }

    public void setIdFederativeUnit(Long idFederativeUnit) {
        this.idFederativeUnit = idFederativeUnit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public List<Dealership> getDealerships() {
        return dealerships;
    }

//    public List<Address> getAdresses() {
//        return adresses;
//    }

    public void statusState(){
        System.out.println("======================================");
        System.out.println("                 Estado               ");
        System.out.println("======================================");
        System.out.println("ID: " + this.getIdFederativeUnit());
        System.out.println("Nome: " + this.getName());
        System.out.println("Prefixo: " + this.getPrefix());
        System.out.println("======================================");
    }
}
