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

    public User(int id, String name, String surname, String phoneNumber, String email, String address, UserType userType, Sex sex, List<Department> departmentList, List<Notification> notificationList, List<Group> groupList) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.userType = userType;
        this.sex = sex;
        this.departmentList = departmentList;
        this.notificationList = notificationList;
        this.groupList = groupList;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public List<Notification> getNotificationList() {
        return notificationList;
    }

    public void setNotificationList(List<Notification> notificationList) {
        this.notificationList = notificationList;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }
}
