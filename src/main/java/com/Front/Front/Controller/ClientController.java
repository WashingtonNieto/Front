package com.Front.Front.Controller;

import com.Front.Front.Entity.Client;
import com.Front.Front.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})

public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/all")
    public List<Client> getAll(){

        return clientService.getAll();
    }

}
