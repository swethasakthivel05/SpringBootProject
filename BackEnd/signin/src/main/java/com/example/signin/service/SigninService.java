package com.example.signin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.signin.model.Client;
import com.example.signin.repository.SigninRepository;

@Service
public class SigninService {
    @Autowired
    private final SigninRepository signinRepository;

    public SigninService(SigninRepository signinRepository) {
        this.signinRepository = signinRepository;
    }

    public Client createSignin(Client client) {
        return signinRepository.save(client);
    }

    public List<Client> getAllSignin() {
        return signinRepository.findAll();
    }

    public Client getSigninId(int clientId) {
        return signinRepository.findById(clientId).orElse(null);
    }

}
