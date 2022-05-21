package com.company.model.event;

import java.time.LocalDateTime;

public class PrivateEvent extends Event{

    private String location;

    public PrivateEvent(int id, String eventName, LocalDateTime startDate, LocalDateTime endDate, int churchId, String location) {
        super(id, eventName, startDate, endDate, churchId);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
