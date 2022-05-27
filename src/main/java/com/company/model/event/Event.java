package com.company.model.event;

import java.time.LocalDateTime;

abstract class Event {

    private int id;
    private String eventName;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Event(int id, String eventName, LocalDateTime startDate, LocalDateTime endDate) {
        this.id = id;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

}
