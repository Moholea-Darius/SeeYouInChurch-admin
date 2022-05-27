package com.company.model;

import com.company.model.enums.Department;
import com.company.model.enums.Sex;
import com.company.model.enums.UserType;
import com.company.model.info.Notification;

import javax.swing.event.ListDataEvent;
import java.util.List;

public class User {

    private int id;
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private String address;
    private UserType userType;
    private Sex sex;
    private List<Department> departmentList;
    private List<Notification> notificationList;
    private List<Group> groupList;

}
