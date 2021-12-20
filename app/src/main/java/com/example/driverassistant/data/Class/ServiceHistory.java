package com.example.driverassistant.data.Class;

import java.util.Date;

public class ServiceHistory {
    private String account_id;
    private String service_id;
    private float latitude,longitude;
    private Date time;
    private float cost;

    public ServiceHistory() {
    }

    public ServiceHistory(String account_id, String service_id, float latitude, float longitude, Date time, float cost) {
        this.account_id = account_id;
        this.service_id = service_id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.time = time;
        this.cost = cost;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getService_id() {
        return service_id;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
