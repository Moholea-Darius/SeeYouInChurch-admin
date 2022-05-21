package com.company.model.enums;

public enum UserType {

    Type1,
    Type2,
    Type3;

    public static UserType fromString(String userType){
        switch (userType) {
            case "Type1":
                return UserType.Type1;
            case "Type2":
                return UserType.Type2;
            case "Type3":
                return UserType.Type3;
            default:
                return null;
        }
    }
}
