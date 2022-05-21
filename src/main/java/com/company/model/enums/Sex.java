package com.company.model.enums;
public enum Sex {

    Male,
    Female;

    public static Sex fromString(String sex){
        switch (sex) {
            case "Male":
                return Sex.Male;
            case "Female":
                return Sex.Female;
            default:
                return null;
        }
    }

}
