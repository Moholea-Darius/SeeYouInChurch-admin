package com.company.model.enums;
public enum StatusRoom {

        Free,
        Occupied;

        public static StatusRoom fromString(String status){
            switch (status) {
                case "Free":
                    return StatusRoom.Free;
                case "Booked":
                    return StatusRoom.Occupied;
                default:
                    return null;
            }
        }

    }

