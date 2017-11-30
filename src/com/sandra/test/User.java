package com.sandra.test;

public class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static <T> int nameCompare(User u1, User u2) {
        return u1.name.compareTo(u2.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
