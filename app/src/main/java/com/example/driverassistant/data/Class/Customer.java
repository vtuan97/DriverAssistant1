package com.example.driverassistant.data.Class;

public class Customer {
    private String id;
    private String name;
    private String phone;
    private String address;

    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Customer(String id, String name, String phone, String address, String type) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.type = type;
    }
}
