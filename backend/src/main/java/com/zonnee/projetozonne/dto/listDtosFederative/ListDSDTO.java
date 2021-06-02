package com.zonnee.projetozonne.dto.listDtosFederative;


import com.zonnee.projetozonne.dto.listDtosDealership.ListFederativeUnitDTO;
import com.zonnee.projetozonne.entities.Dealership;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListDSDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long idDealership;
    private String name;



    public ListDSDTO(Dealership entity) {
        idDealership = entity.getIdDealership();
        name = entity.getName();
    }
}
