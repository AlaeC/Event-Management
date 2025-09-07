package com.project.eventManagement.Service;


import com.project.eventManagement.Model.Event;
import com.project.eventManagement.Repo.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepo repo;


    public List<Event> getAllEvent() {
        return repo.findAll();

    }


    public Event addEvent( Event event){
        return repo.save(event);
    }

    public Event updateEvent(Event event) {
        return repo.save(event);
    }

    public void deleteEvent(Long id) {
        repo.deleteById(id);
    }
}
