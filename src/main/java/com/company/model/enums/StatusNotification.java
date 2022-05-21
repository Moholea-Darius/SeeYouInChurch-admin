package com.company.model.enums;

public enum StatusNotification {

        Unread,
        Read;

        public static StatusNotification fromString(String status){
            switch (status) {
                case "Unread":
                    return StatusNotification.Unread;
                case "Read":
                    return StatusNotification.Read;
                default:
                    return null;
            }
        }

    }

