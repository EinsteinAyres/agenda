package com.agendadigital.service;

import com.agendadigital.dto.EventDTO;
import jdk.jfr.Event;

import java.util.List;

public interface EventService {
    Event createEvent(EventDTO eventDTO);
    Event updateEvent(Long eventId, EventDTO eventDTO);
    Event getEventById(Long eventId);
    void deleteEvent(Long eventId);
    List<Event> getAllEventsForUser(Long userId);
}
