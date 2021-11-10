package com.Front.Front.Controller;

import com.Front.Front.Entity.Message;
import com.Front.Front.Services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})

public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping("/all")
    public List<Message> getAll(){

        return messageService.getAll();
    }

}
