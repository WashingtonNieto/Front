package com.Front.Front.Services;

import com.Front.Front.Entity.Score;
import com.Front.Front.Repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {

    @Autowired
    ScoreRepository scoreRepository;

    public List<Score> getAll(){
        return scoreRepository.findAll();
    }
}
