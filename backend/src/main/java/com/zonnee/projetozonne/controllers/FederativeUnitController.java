package com.zonnee.projetozonne.controllers;

import com.zonnee.projetozonne.dto.FederativeUnitDTO;
import com.zonnee.projetozonne.entities.FederativeUnit;
import com.zonnee.projetozonne.repositories.FederativeUnitRepository;
import com.zonnee.projetozonne.services.FederativeUnitService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.websocket.server.PathParam;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/federative-units")
public class FederativeUnitController {

    @Autowired
    private FederativeUnitService service;
    private FederativeUnitRepository repository;

    @GetMapping
    public ResponseEntity<List<FederativeUnitDTO>> findAll(){
        List<FederativeUnitDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping
    public ResponseEntity<FederativeUnitDTO> insert(@RequestBody FederativeUnitDTO entity) {
        try {
            FederativeUnitDTO obj = service.insertFederativeUnit(entity);
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                    .buildAndExpand(obj.getIdFederativeUnit()).toUri();
            return ResponseEntity.created(uri).body(obj);
        } catch (ServiceException e) {
            return ResponseEntity.unprocessableEntity().build();
        }
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<FederativeUnit> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        service.deleteFederativeUnitById(id);
        return ResponseEntity.ok("Unidade Federativa " + id + " deletado!");
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<FederativeUnitDTO> editFederativeUnit(@PathVariable Long id, @RequestBody FederativeUnit update){
        return ResponseEntity.ok(service.editFederativeUnit(id, update));
    }

}


