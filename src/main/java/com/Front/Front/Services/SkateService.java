package com.Front.Front.Services;

import com.Front.Front.Entity.Skate;
import com.Front.Front.Repository.SkateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkateService {

    @Autowired
    SkateRepository skateRepository;

    public List<Skate> getAll(){
        return skateRepository.findAll();
    }
}
