package com.Front.Front.Services;

import com.Front.Front.Entity.Category;
import com.Front.Front.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAll(){

        return categoryRepository.findAll();

    }
}
