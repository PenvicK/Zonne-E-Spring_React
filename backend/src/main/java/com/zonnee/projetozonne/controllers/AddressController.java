package com.zonnee.projetozonne.controllers;

import com.zonnee.projetozonne.dto.AddressDTO;

import com.zonnee.projetozonne.entities.Address;
import com.zonnee.projetozonne.services.AddressService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/addresses")
public class AddressController {

    @Autowired
    private AddressService service;

    // GET ALL
    @GetMapping
    public ResponseEntity<List<AddressDTO>> findAll() {
        List<AddressDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    // POST ENTITY
    @PostMapping
    public ResponseEntity<AddressDTO> insert(@RequestBody AddressDTO entity) {
        try {
            AddressDTO obj = service.insertAddress(entity);
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                    .buildAndExpand(obj.getIdAddress()).toUri();
            return ResponseEntity.created(uri).body(obj);
        } catch (ServiceException e) {
            return ResponseEntity.unprocessableEntity().build();
        }
    }

    // GET BY ID
    @GetMapping(path = "/{id}")
    public ResponseEntity<Address> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    //DELETE BY ID
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        service.deleteAddressById(id);
        return ResponseEntity.ok("Endereço " + id + " deletado!");
    }

    // EDIT BY ID
    @PutMapping(path = "/{id}")
    public ResponseEntity<Address> edit(@PathVariable Long id, @RequestBody Address update){
        return ResponseEntity.ok(service.editAddress(id, update));
    }
}
