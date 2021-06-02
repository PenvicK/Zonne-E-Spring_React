package com.zonnee.projetozonne.dto.listDtosFederative;

import com.zonnee.projetozonne.entities.FederativeUnit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListUFDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long idFederativeUnit;
    private String name;
    private String prefix;
    private List<ListDSDTO> dealerships = new ArrayList<>();

    public ListUFDTO(FederativeUnit entity) {
        idFederativeUnit = entity.getIdFederativeUnit();
        name = entity.getName();
        prefix = entity.getPrefix();
        dealerships = entity.getDealerships().stream().map(dealership -> new ListDSDTO(dealership)).collect(Collectors.toList());
    }

}
