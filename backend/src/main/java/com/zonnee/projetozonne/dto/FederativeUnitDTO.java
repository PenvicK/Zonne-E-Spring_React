package com.zonnee.projetozonne.dto;


import com.zonnee.projetozonne.entities.FederativeUnit;

import java.io.Serializable;

public class FederativeUnitDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long idFederativeUnit;
    private String name;
    private String prefix;

    public FederativeUnitDTO(){

    }

    public FederativeUnitDTO(Long idFederativeUnit, String name, String prefix) {
        this.idFederativeUnit = idFederativeUnit;
        this.name = name;
        this.prefix = prefix;
    }
    public FederativeUnitDTO(FederativeUnit entity) {
        idFederativeUnit = entity.getIdFederativeUnit();
        name = entity.getName();
        prefix = entity.getPrefix();
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
}
