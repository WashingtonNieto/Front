package com.Front.Front.Controller;

import com.Front.Front.Entity.Category;
import com.Front.Front.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Category")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})

public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getAll(){

        return categoryService.getAll();
    }


}
