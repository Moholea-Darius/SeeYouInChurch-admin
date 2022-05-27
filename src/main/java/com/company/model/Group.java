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

}
