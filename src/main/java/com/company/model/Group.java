package com.company.model;

import com.company.model.event.PrivateEvent;
import com.company.model.event.PublicEvent;

import java.util.List;

public class Group {

    private int id;
    private String name;
    private String description;
    private List<PublicEvent> publicEventList;
    private List<PrivateEvent> privateEventList;

    public Group(int id, String name, String description, List<PublicEvent> publicEventList, List<PrivateEvent> privateEventList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.publicEventList = publicEventList;
        this.privateEventList = privateEventList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PublicEvent> getPublicEventList() {
        return publicEventList;
    }

    public void setPublicEventList(List<PublicEvent> publicEventList) {
        this.publicEventList = publicEventList;
    }

    public List<PrivateEvent> getPrivateEventList() {
        return privateEventList;
    }

    public void setPrivateEventList(List<PrivateEvent> privateEventList) {
        this.privateEventList = privateEventList;
    }
}
