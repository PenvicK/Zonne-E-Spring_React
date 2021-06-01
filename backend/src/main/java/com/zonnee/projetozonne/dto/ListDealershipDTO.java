package com.zonnee.projetozonne.dto;


import com.zonnee.projetozonne.entities.Dealership;
import com.zonnee.projetozonne.entities.FederativeUnit;
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


    public ListDealershipDTO(Dealership entity) {
        idDealership = entity.getIdDealership();
        name = entity.getName();
    }
}
