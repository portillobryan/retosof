package com.co.sofka.models;

public class UserModel {

    private static Integer Id;

    private static String first_name;

    private static String last_name;


    public UserModel(Integer id, String first_name,String last_name) {
        Id = id;
        first_name = first_name;
        last_name = last_name;

    }
    public static Integer getId() {
        return Id;
    }

    public static String getFirst_name() {
        return first_name;
    }

    public static String getLast_name() {
        return last_name;
    }

    public static void setId(Integer id) {
        Id = id;
    }

    public static void setFirst_name(String first_name) {
        UserModel.first_name = first_name;
    }

    public static void setLast_name(String last_name) {
        UserModel.last_name = last_name;
    }
}

