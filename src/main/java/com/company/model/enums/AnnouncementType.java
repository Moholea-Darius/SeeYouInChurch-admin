package com.company.model.enums;

public enum AnnouncementType {

        Type1,
        Type2,
        Type3;

        public static AnnouncementType fromString(String announcementType){
            switch (announcementType) {
                case "Type1":
                    return AnnouncementType.Type1;
                case "Type2":
                    return AnnouncementType.Type2;
                case "Type3":
                    return AnnouncementType.Type3;
                default:
                    return null;
            }
        }
    }

