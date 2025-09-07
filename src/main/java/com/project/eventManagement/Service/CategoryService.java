package com.project.eventManagement.Service;

import com.project.eventManagement.Model.Category;
import com.project.eventManagement.Repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo repo;

    public List<Category> getAllCategory() {
        return repo.findAll();
    }

    public Category addCategory(Category category) {
        return repo.save(category);
    }

    public Category updateCategory(Category category) {
        return repo.save(category);
    }

    public void deleteCategory(Long  id){
        repo.deleteById(id);
    }


}
