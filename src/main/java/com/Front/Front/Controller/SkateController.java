package com.Front.Front.Controller;


import com.Front.Front.Entity.Skate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Skate")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})

public class SkateController {

    @GetMapping("/all")
    public List<Skate> getAll(){
        return null;
    }
}
