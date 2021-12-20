package com.example.driverassistant.data.Class;

public class ServiceCounter {
    private String account_id;
    private String service_id;
    private float defaul;
    private float curr_count;

    public ServiceCounter() {
    }

    public ServiceCounter(String account_id, String service_id, float defaul, float curr_count) {
        this.account_id = account_id;
        this.service_id = service_id;
        this.defaul = defaul;
        this.curr_count = curr_count;
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

    public float getDefaul() {
        return defaul;
    }

    public void setDefaul(float defaul) {
        this.defaul = defaul;
    }

    public float getCurr_count() {
        return curr_count;
    }

    public void setCurr_count(float curr_count) {
        this.curr_count = curr_count;
    }
}
