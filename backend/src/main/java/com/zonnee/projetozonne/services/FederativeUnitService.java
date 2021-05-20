package com.zonnee.projetozonne.services;

import com.zonnee.projetozonne.dto.FederativeUnitDTO;
import com.zonnee.projetozonne.entities.FederativeUnit;
import com.zonnee.projetozonne.repositories.FederativeUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FederativeUnitService {

    @Autowired
    private FederativeUnitRepository repository;

    public List<FederativeUnitDTO> findAll() {
        List<FederativeUnit> result = repository.findAll();
        return result.stream().map(x -> new FederativeUnitDTO(x)).collect(Collectors.toList());
    }

//    public FederativeUnitDTO saveFederativeUnit(FederativeUnitDTO federativeUnitDTO){
//        return repository.save(federativeUnitDTO);
//    }
}
