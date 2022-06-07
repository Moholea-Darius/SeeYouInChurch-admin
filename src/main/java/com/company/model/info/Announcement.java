package com.company.model.info;

import com.company.model.enums.AnnouncementType;
import com.company.model.enums.UserType;

import java.time.LocalDateTime;

public class Announcement {

    private int id;
    private String sender;
    private String message;
    private AnnouncementType announcementType;
    private LocalDateTime dateSent;


    public Announcement(int id, String sender, String message, AnnouncementType announcementType, LocalDateTime dateSent) {
        this.id = id;
        this.sender = sender;
        this.message = message;
        this.announcementType = announcementType;
        this.dateSent = dateSent;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AnnouncementType getAnnouncementType() {
        return announcementType;
    }

    public void setAnnouncementType(AnnouncementType announcementType) {
        this.announcementType = announcementType;
    }

    public LocalDateTime getDateSent() {
        return dateSent;
    }

    public void setDateSent(LocalDateTime dateSent) {
        this.dateSent = dateSent;
    }

}
