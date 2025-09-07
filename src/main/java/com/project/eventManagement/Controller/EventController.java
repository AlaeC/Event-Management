package com.project.eventManagement.Controller;


import com.project.eventManagement.Model.Event;
import com.project.eventManagement.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EventController {
    @Autowired
    private EventService service;

    @GetMapping("/events")
    public List<Event> getAllEvent() {
        return service.getAllEvent();

    }

    @PostMapping("/events")
    public Event addEvent(@RequestBody Event event) {
        return service.addEvent(event);
    }

    @PutMapping("/events")
    public Event updateEvent(@RequestBody Event event) {
        return service.updateEvent(event);
    }

    @DeleteMapping("/events/{id}")
    public void deleteEvent(@PathVariable Long id){
        service.deleteEvent(id);
    }

}
