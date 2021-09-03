package com.bhagya.springboot.xmlExample.dom;

public class Staff {
    private final String firstName, lastName,nickName;
    public Staff(String firstName, String lastName, String nickName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }
}
