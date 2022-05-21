package com.company.model.info;

import com.company.model.enums.StatusNotification;

import java.time.LocalDateTime;

public class Notification {

    private int id;
    private String sender;
    private String name;
    private String message;
    private LocalDateTime dateSent;
    private LocalDateTime dateRead;
    private StatusNotification status;
    private int userId;

    public Notification(int id, String sender, String name, String message, LocalDateTime dateSent, LocalDateTime dateRead, StatusNotification status, int userId) {
        this.id = id;
        this.sender = sender;
        this.name = name;
        this.message = message;
        this.dateSent = dateSent;
        this.dateRead = dateRead;
        this.status = status;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDateSent() {
        return dateSent;
    }

    public void setDateSent(LocalDateTime dateSent) {
        this.dateSent = dateSent;
    }

    public LocalDateTime getDateRead() {
        return dateRead;
    }

    public void setDateRead(LocalDateTime dateRead) {
        this.dateRead = dateRead;
    }

    public StatusNotification getStatus() {
        return status;
    }

    public void setStatus(StatusNotification status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
