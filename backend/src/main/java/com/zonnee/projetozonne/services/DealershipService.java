package com.zonnee.projetozonne.services;

import com.zonnee.projetozonne.dto.DealershipDTO;
import com.zonnee.projetozonne.dto.ListDealershipDTO;
import com.zonnee.projetozonne.entities.Dealership;
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

    // FIND ALL
    public List<ListDealershipDTO> findAll() {
        List<Dealership> result = repository.findAll();
        return result.stream().map(x -> new ListDealershipDTO(x)).collect(Collectors.toList());
    }

    // FIND BY ID
    public Dealership findById(Long id) {
        Optional<Dealership> result = repository.findById(id);
        return result.orElseThrow(() -> new ServiceException("Dealership not found. Please try again."));
    }

    // POST NEW DEALERSHIP
    public DealershipDTO insertDealership(DealershipDTO dealershipDTO){
        // VALIDAÇÃO
        Dealership dealership = repository.findByName(dealershipDTO.getName());
        if (dealership != null){
            throw new ServiceException("Concessionaria já existe");
        }
        // INSERT
        Dealership unit = new Dealership();

        unit.setIdDealership(dealershipDTO.getIdDealership());
        unit.setName(dealershipDTO.getName());
        unit.setIdFederativeUnit(dealershipDTO.getFederativeUnitDTO());

        unit = repository.save(unit);

        return new DealershipDTO(unit);
    }

    // DELETE BY ID
    public void deleteDealershipById(Long id){
        repository.delete(findById(id));
    }

    // EDIT
    public Dealership editDealership(Long id, Dealership update){
        // VALIDAÇÃO
        Dealership dealership = findById(id);
        Dealership checkUpdate = repository.findByName(update.getName());
        if (checkUpdate != null){
            throw new ServiceException("Unidade Federativa já existe");
        }

        // PUT
        dealership.setName(update.getName());
        dealership.setIdFederativeUnit(update.getIdFederativeUnit());
        repository.save(dealership);
        return dealership;
    }
}
