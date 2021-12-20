package com.example.driverassistant.data.Class;

public class Account {
    private String id;
    private String customer_id;
    private String username;
    private String password;

    public Account() {
    }

    public Account(String id, String customer_id, String username, String password) {
        this.id = id;
        this.customer_id = customer_id;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
