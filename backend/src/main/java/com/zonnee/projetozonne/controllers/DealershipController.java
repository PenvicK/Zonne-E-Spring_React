package com.zonnee.projetozonne.controllers;

import com.zonnee.projetozonne.dto.DealershipDTO;
import com.zonnee.projetozonne.dto.listDtosDealership.ListDealershipDTO;
import com.zonnee.projetozonne.entities.Dealership;
import com.zonnee.projetozonne.services.DealershipService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/dealerships")
public class DealershipController {

    @Autowired
    private DealershipService service;

    // GET ALL
    @GetMapping
    public ResponseEntity<List<ListDealershipDTO>> findAll(){
        List<ListDealershipDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    // POST ENTITY
    @PostMapping
    public ResponseEntity<DealershipDTO> insert(@RequestBody DealershipDTO entity) {
        try {
            DealershipDTO obj = service.insertDealership(entity);
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                    .buildAndExpand(obj.getIdDealership()).toUri();
            return ResponseEntity.created(uri).body(obj);
        } catch (ServiceException e) {
            return ResponseEntity.unprocessableEntity().build();
        }
    }

    // GET BY ID
    @GetMapping(path = "/{id}")
    public ResponseEntity<Dealership> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    //DELETE BY ID
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        service.deleteDealershipById(id);
        return ResponseEntity.ok("Conssecionaria " + id + " deletado!");
    }

    // EDIT BY ID
    @PutMapping(path = "/{id}")
    public ResponseEntity<Dealership> edit(@PathVariable Long id, @RequestBody Dealership update){
        return ResponseEntity.ok(service.editDealership(id, update));
    }
}


