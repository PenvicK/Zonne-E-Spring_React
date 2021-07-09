package com.zonnee.projetozonne.services;

import com.zonnee.projetozonne.dto.AddressDTO;
import com.zonnee.projetozonne.entities.Address;
import com.zonnee.projetozonne.repositories.AddressRepository;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repository;

    // FIND ALL
    public List<AddressDTO> findAll() {
        List<Address> result = repository.findAll();
        return result.stream().map(x -> new AddressDTO(x)).collect(Collectors.toList());
    }

    // POST NEW ADDRESS
    public AddressDTO insertAddress(AddressDTO addressDTO){
        Address unit = new Address();

        unit.setCity(addressDTO.getCity());
        unit.setStreet(addressDTO.getStreet());
        unit.setNumber(addressDTO.getNumber());
        unit.setDistrict(addressDTO.getDistrict());

        unit = repository.save(unit);

        return new AddressDTO(unit);
    }

    // FIND BY ID
    public Address findById(Long id) {
        Optional<Address> result = repository.findById(id);
        return result.orElseThrow(() -> new ServiceException("Address not found. Please try again."));
    }

    // DELETE BY ID
    public void deleteAddressById(Long id){
        repository.delete(findById(id));
    }

    // EDIT
    public Address editAddress(Long id, Address update){
        Address address = findById(id);
        address.setCity(update.getCity());
        address.setStreet(update.getStreet());
        address.setNumber(update.getNumber());
        address.setDistrict(update.getDistrict());
        repository.save(address);
        return address;
    }
}
