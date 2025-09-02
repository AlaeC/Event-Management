package com.project.eventManagement.Repo;

import com.project.eventManagement.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
