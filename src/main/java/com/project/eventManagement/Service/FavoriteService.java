package com.project.eventManagement.Service;

import com.project.eventManagement.Model.Favorite;
import com.project.eventManagement.Repo.FavoriteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LENOVO
 **/
@Service
public class FavoriteService {


    @Autowired
    private FavoriteRepo repo;

    public List<Favorite> getAllFavorites() {
        return repo.findAll();
    }

    public Favorite addFavorite(Favorite fav) {
        return repo.save(fav);
    }

    public void deleteFavorite(Long id) {
        repo.deleteById(id);
    }


}
