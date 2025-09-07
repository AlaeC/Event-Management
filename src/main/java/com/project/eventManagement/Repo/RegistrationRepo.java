package com.project.eventManagement.Repo;

import com.project.eventManagement.Model.EventRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author LENOVO
 **/
public interface RegistrationRepo extends JpaRepository<EventRegistration, Long> {
}
