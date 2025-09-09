package com.project.eventManagement.Controller;


import com.project.eventManagement.Model.EventRegistration;
import com.project.eventManagement.Service.EventRegistrationService;
import com.project.eventManagement.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EventRegistrationController {

    @Autowired
    private EventRegistrationService service;



}
