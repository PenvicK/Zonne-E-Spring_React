package com.zonnee.projetozonne.controllers;

import com.zonnee.projetozonne.config.jwt.AuthenticationRequest;
import com.zonnee.projetozonne.config.jwt.AuthenticationResponse;
import com.zonnee.projetozonne.config.jwt.JwtUtil;
import com.zonnee.projetozonne.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login")
public class AuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtil jwtUtil;


    @PostMapping
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{
        try {
            System.out.println("Entrou na funçao de autentificação, username: " + authenticationRequest.getUsername() + ", password: " + authenticationRequest.getPassword());
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),
                    authenticationRequest.getPassword()));
            System.out.println("Teste final try");
        } catch (BadCredentialsException e) {
            System.out.println("Caiu no Catch");
            throw new Exception("Incorrect username or password", e);
        }
        System.out.println("Saiu do try!");
        final UserDetails user = userService.loadUserByUsername(authenticationRequest.getUsername());

        final String jwt = jwtUtil.generateToken(user);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}
