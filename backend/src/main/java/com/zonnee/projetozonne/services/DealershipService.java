package com.zonnee.projetozonne.services;

import com.zonnee.projetozonne.dto.DealershipDTO;
import com.zonnee.projetozonne.dto.FederativeUnitDTO;
import com.zonnee.projetozonne.entities.Dealership;
import com.zonnee.projetozonne.entities.FederativeUnit;
import com.zonnee.projetozonne.repositories.DealershipRepository;
import com.zonnee.projetozonne.services.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DealershipService {

    @Autowired
    private DealershipRepository repository;

    public List<DealershipDTO> findAll() {
        List<Dealership> result = repository.findAll();
        return result.stream().map(x -> new DealershipDTO(x)).collect(Collectors.toList());
    }

    public Dealership findById(Long id) {
        Optional<Dealership> result = repository.findById(id);
        return result.orElseThrow(() -> new ServiceException("Dealership not found. Please try again."));
    }
   public DealershipDTO insertDealership(DealershipDTO dealershipDTO){
        Dealership dealership = repository.findByName(dealershipDTO.getName());
        if (dealership != null){
            throw new ServiceException("Concessionaria já existe");
        }
        Dealership unit = new Dealership();
        unit.setName(dealershipDTO.getName());
        unit.setIdFederativeUnit(dealershipDTO.getFederativeUnitDTO());

        unit = repository.save(unit);

        return new DealershipDTO(unit);
    }

    public void deleteDealershipById(Long id){
        repository.delete(findById(id));
    }
    public Dealership editDealership(Long id, Dealership update){
        Dealership dealership = findById(id);
        Dealership checkUpdate = repository.findByName(update.getName());
        if (checkUpdate != null){
            throw new ServiceException("Unidade Federativa já existe");
        }
        dealership.setName(update.getName());
        dealership.setIdFederativeUnit(update.getIdFederativeUnit());
        repository.save(dealership);
        return dealership;
    }
}
