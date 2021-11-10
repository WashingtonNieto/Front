package com.Front.Front.Services;

import com.Front.Front.Entity.Client;
import com.Front.Front.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<Client> getAll(){
        return clientRepository.findAll();
    }
}
