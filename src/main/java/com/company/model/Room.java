package com.company.model;

import com.company.model.enums.StatusRoom;

public class Room {

    private int id;
    private int roomNumber;
    private int maxCapacity;
    private StatusRoom StatusRoom;

    public Room(int id, int roomNumber, int maxCapacity, StatusRoom StatusRoom) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.maxCapacity = maxCapacity;
        this.StatusRoom = StatusRoom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public StatusRoom getRoomStatus() {
        return StatusRoom;
    }

    public void setRoomStatus(StatusRoom StatusRoom) {
        this.StatusRoom = StatusRoom;
    }


}
