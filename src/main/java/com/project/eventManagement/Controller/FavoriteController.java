package com.project.eventManagement.Controller;

import com.project.eventManagement.Model.Favorite;
import com.project.eventManagement.Service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author LENOVO
 **/
@RestController
@RequestMapping("/api")
public class FavoriteController {


    @Autowired
    private FavoriteService service;

    @GetMapping("/favorites")
    public List<Favorite> getFavorites() {
        return service.getAllFavorites();

    }

    @PostMapping("/favorites")
    public Favorite addFavorite(@RequestBody Favorite favorite) {
        return service.addFavorite(favorite);
    }


    @DeleteMapping("/favorites/{id}")
    public void deleteFavorite(@PathVariable Long id) {
        service.deleteFavorite(id);
    }
}
