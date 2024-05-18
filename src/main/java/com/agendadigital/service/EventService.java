package com.agendadigital.service;

import com.example.agendadigital.dto.EventDTO;
import com.example.agendadigital.model.Event;

import java.util.List;

public interface EventService {
    Event createEvent(EventDTO eventDTO);
    Event updateEvent(Long eventId, EventDTO eventDTO);
    Event getEventById(Long eventId);
    void deleteEvent(Long eventId);
    List<Event> getAllEventsForUser(Long userId);
}
