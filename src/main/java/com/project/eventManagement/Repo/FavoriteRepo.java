package com.project.eventManagement.Repo;

import com.project.eventManagement.Model.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepo extends JpaRepository<Favorite, Long> {
}
