package com.zonnee.projetozonne.dto;


import com.zonnee.projetozonne.entities.Dealership;
import com.zonnee.projetozonne.entities.FederativeUnit;
import com.zonnee.projetozonne.services.FederativeUnitService;
import lombok.*;

import javax.persistence.FetchType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DealershipDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long idDealership;
    private String name;

    private FederativeUnit federativeUnitDTO;

    public DealershipDTO(Dealership entity) {
        idDealership = entity.getIdDealership();
        name = entity.getName();
        federativeUnitDTO = entity.getIdFederativeUnit();
    }
}
