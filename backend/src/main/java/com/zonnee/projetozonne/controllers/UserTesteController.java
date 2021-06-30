package com.zonnee.projetozonne.controllers;

import com.zonnee.projetozonne.dto.DealershipDTO;
import com.zonnee.projetozonne.dto.UserTesteDTO;
import com.zonnee.projetozonne.dto.listDtosDealership.ListDealershipDTO;
import com.zonnee.projetozonne.entities.Dealership;
import com.zonnee.projetozonne.entities.UserTeste;
import com.zonnee.projetozonne.services.DealershipService;
import com.zonnee.projetozonne.services.UserService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/user-test")
public class UserTesteController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserTesteDTO> registerUser(@RequestBody UserTeste user) {
        try {
            return new ResponseEntity<>(userService.addNewUser(user), HttpStatus.CREATED);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.valueOf(500), "Something went Wrong");
        }
    }
}


