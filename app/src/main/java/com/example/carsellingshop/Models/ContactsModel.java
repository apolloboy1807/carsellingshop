package com.example.carsellingshop.Models;

public class ContactsModel {

    int contactImage;
    String soldCarName , price , contactNumber;

    public ContactsModel(int contactImage, String soldCarName, String price, String contactNumber) {
        this.contactImage = contactImage;
        this.soldCarName = soldCarName;
        this.price = price;
        this.contactNumber = contactNumber;
    }

    public int getContactImage() {
        return contactImage;
    }

    public void setContactImage(int contactImage) {
        this.contactImage = contactImage;
    }

    public String getSoldCarName() {
        return soldCarName;
    }

    public void setSoldCarName(String soldCarName) {
        this.soldCarName = soldCarName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}

