package com.project.eventManagement.Controller;

import com.project.eventManagement.Model.Category;
import com.project.eventManagement.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @GetMapping("/categories")
   public List<Category> getAllCategory() {
       return service.getAllCategory();
   }

   @PostMapping("/categories")
   public Category addCategory(@RequestBody Category category){
       return service.addCategory(category);
   }

   @PutMapping("/categories")
   public Category updateCategory(@RequestBody Category category) {
       return service.updateCategory(category);
   }

   @DeleteMapping("/categories/{id}")
   public void deleteCategory(@PathVariable Long id){
       service.deleteCategory(id);
   }

}
