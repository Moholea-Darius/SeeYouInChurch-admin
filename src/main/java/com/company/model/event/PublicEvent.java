package com.company.model.event;

import java.time.LocalDateTime;

public class PublicEvent extends Event{

    private int roomId;

    public PublicEvent(int id, String eventName, LocalDateTime startDate, LocalDateTime endDate, int roomId) {
        super(id, eventName, startDate, endDate);
        this.roomId = roomId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
}
