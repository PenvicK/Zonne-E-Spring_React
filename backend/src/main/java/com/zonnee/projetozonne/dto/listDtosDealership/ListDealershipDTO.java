package com.zonnee.projetozonne.dto.listDtosDealership;


import com.zonnee.projetozonne.entities.Dealership;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListDealershipDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long idDealership;
    private String name;

    private ListFederativeUnitDTO federativeUnitDTO;

    public ListDealershipDTO(Dealership entity) {
        idDealership = entity.getIdDealership();
        name = entity.getName();
        federativeUnitDTO = new ListFederativeUnitDTO(entity.getIdFederativeUnit());
    }
}
