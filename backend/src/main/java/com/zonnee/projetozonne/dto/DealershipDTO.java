package com.zonnee.projetozonne.dto;


import com.zonnee.projetozonne.entities.Dealership;
import com.zonnee.projetozonne.entities.FederativeUnit;
import com.zonnee.projetozonne.services.FederativeUnitService;

import javax.persistence.FetchType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DealershipDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long idDealership;
    private String name;

    private List<FederativeUnitDTO> federativeUnitDTO = new ArrayList<>();

    public DealershipDTO(){

    }

    public DealershipDTO(Long idDealership, String name, FederativeUnitDTO federativeUnit) {
        this.idDealership = idDealership;
        this.name = name;
        this.federativeUnitDTO = federativeUnit;
    }
    public DealershipDTO(Dealership entity) {
        idDealership = entity.getIdDealership();
        name = entity.getName();
        federativeUnitDTO = entity.getIdFederativeUnit().stream().map(federative -> new FederativeUnitDTO(federative)).collect(Collectors.toList());
//        , fetch = FetchType.LAZY
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

    public FederativeUnitDTO getFederativeUnitDTO() {
        return federativeUnitDTO;
    }

    public void setFederativeUnitDTO(FederativeUnitDTO federativeUnitDTO) {
        this.federativeUnitDTO = federativeUnitDTO;
    }
}
