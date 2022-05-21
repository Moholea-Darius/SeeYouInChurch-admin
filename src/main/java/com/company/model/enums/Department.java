package com.company.model.enums;

public enum Department {

    Type1,
    Type2,
    Type3;

    public static Department fromString(String department){
        switch (department) {
            case "Type1":
                return Department.Type1;
            case "Type2":
                return Department.Type2;
            case "Type3":
                return Department.Type3;
            default:
                return null;
        }
    }

}
