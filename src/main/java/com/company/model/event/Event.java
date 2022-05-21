package com.company.model.event;

import java.time.LocalDateTime;

abstract class Event {

    private int id;
    private String eventName;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int churchId;

    public Event(int id, String eventName, LocalDateTime startDate, LocalDateTime endDate, int churchId) {
        this.id = id;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.churchId = churchId;
    }

}
