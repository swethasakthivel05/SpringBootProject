package com.example.signin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.signin.model.Client;
import com.example.signin.service.SigninService;

@RestController
@RequestMapping("/api")
public class SigninController {
    @Autowired
    private final SigninService signinService;

    public SigninController(SigninService signinService) {
        this.signinService = signinService;
    }

    @PostMapping("/signin")
    // insert the data
    public ResponseEntity<Client> createSignin(@RequestBody Client client) {
        Client createSignin = signinService.createSignin(client);
        return new ResponseEntity<>(createSignin, HttpStatus.CREATED);
    }

    @GetMapping("/signin")
    public ResponseEntity<List<Client>> getAllSignin() {
        List<Client> client = signinService.getAllSignin();
        return new ResponseEntity<>(client, HttpStatus.OK);
    }

    @GetMapping("/signin/{signinId}")
    public ResponseEntity<Client> getById(@PathVariable int signinId) {
        Client client = signinService.getSigninId(signinId);
        if (client != null) {
            return new ResponseEntity<>(client, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
