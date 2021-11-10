package com.Front.Front.Controller;

import com.Front.Front.Entity.Score;
import com.Front.Front.Services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Score")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})

public class ScareController {

    @Autowired
    ScoreService scoreService;

    @GetMapping("/all")
    public List<Score> getAll(){

        return scoreService.getAll();
    }
}
