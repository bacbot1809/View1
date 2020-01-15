package com.example.baitap1;

public class Contact {
    private int ID;
    private String Name;
    private String PhoneNumber;
    private boolean status;

    public Contact(int ID, String name, String phoneNumber, boolean status) {
        this.ID = ID;
        Name = name;
        PhoneNumber = phoneNumber;
        this.status = status;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public boolean isStatus() {
        return status;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
