package com.company.model;

import com.company.model.enums.StatusRoom;

public class Room {

    private int id;
    private int roomNumber;
    private int maxCapacity;
    private StatusRoom roomStatusRoom;

    public Room(int id, int roomNumber, int maxCapacity, StatusRoom roomStatusRoom ) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.maxCapacity = maxCapacity;
        this.roomStatusRoom = roomStatusRoom;
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
        return roomStatusRoom;
    }

    public void setRoomStatus(StatusRoom roomStatusRoom) {
        this.roomStatusRoom = roomStatusRoom;
    }


}
