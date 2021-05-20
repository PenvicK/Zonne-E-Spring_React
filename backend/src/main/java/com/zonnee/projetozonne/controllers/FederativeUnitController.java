package com.zonnee.projetozonne.controllers;

import com.zonnee.projetozonne.dto.FederativeUnitDTO;
import com.zonnee.projetozonne.entities.FederativeUnit;
import com.zonnee.projetozonne.services.FederativeUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/federative-units")
public class FederativeUnitController {

    @Autowired
    private FederativeUnitService service;

    @GetMapping
    public ResponseEntity<List<FederativeUnitDTO>> findAll(){
        List<FederativeUnitDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }

//    @PostMapping
//    public FederativeUnitDTO saveFederativeUnit(@RequestBody FederativeUnitDTO federativeUnitDTO){
//        return service.saveFederativeUnit();
//    }
}
