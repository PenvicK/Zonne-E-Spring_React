package com.zonnee.projetozonne.services;

import com.zonnee.projetozonne.dto.FederativeUnitDTO;
import com.zonnee.projetozonne.entities.FederativeUnit;
import com.zonnee.projetozonne.repositories.FederativeUnitRepository;
import com.zonnee.projetozonne.services.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FederativeUnitService {

    @Autowired
    private FederativeUnitRepository repository;

    public List<FederativeUnitDTO> findAll() {
        List<FederativeUnit> result = repository.findAll();
        return result.stream().map(x -> new FederativeUnitDTO(x)).collect(Collectors.toList());
    }

    public FederativeUnitDTO insertFederativeUnit(FederativeUnitDTO federativeUnitDTO){
        FederativeUnit federativeUnit = repository.findByName(federativeUnitDTO.getName());
        if (federativeUnit != null){
            throw new ServiceException("Unidade Federativa já existe");
        }
        FederativeUnit unit = new FederativeUnit();
        unit.setName(federativeUnitDTO.getName());
        unit.setPrefix(federativeUnitDTO.getPrefix());

        unit = repository.save(unit);

        return new FederativeUnitDTO(unit);
    }

    public FederativeUnit findById(Long id) {
        Optional<FederativeUnit> result = repository.findById(id);
        return result.orElseThrow(() -> new ServiceException("Federative Unit not found. Please try again."));
    }

    public void deleteFederativeUnitById(Long id){
        repository.delete(findById(id));
    }
    public FederativeUnitDTO editFederativeUnit(Long id, FederativeUnit update){
        FederativeUnitDTO dto = new FederativeUnitDTO();
        FederativeUnit federativeUnit = findById(id);
        FederativeUnit checkUpdate = repository.findByName(update.getName());
        if (checkUpdate != null){
            throw new ServiceException("Unidade Federativa já existe");
        }
        federativeUnit.setName(update.getName());
        federativeUnit.setPrefix(update.getPrefix());

        dto.setIdFederativeUnit(id);
        dto.setName(update.getName());
        dto.setPrefix(update.getPrefix());

        repository.save(federativeUnit);

        return dto;
    }
}
