package com.zonnee.projetozonne.dto;

import com.zonnee.projetozonne.entities.FederativeUnit;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FederativeUnitDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long idFederativeUnit;
    private String name;
    private String prefix;

    private List<DealershipDTO> dealershipDTOS = new ArrayList<>();

    public FederativeUnitDTO(FederativeUnit entity) {
        idFederativeUnit = entity.getIdFederativeUnit();
        name = entity.getName();
        prefix = entity.getPrefix();
        dealershipDTOS = entity.getDealerships().stream().map(dealership -> new DealershipDTO(dealership)).collect(Collectors.toList());
    }

}
