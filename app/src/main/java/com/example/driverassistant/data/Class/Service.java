package com.example.driverassistant.data.Class;

public class Service {
    private String id;
    private String name;
    private int type_service;// time hoặc distance
    private float counting;// giá trị thể hiện là khoảng cách(km) hoặc time(day) tùy theo type_service

    public Service() {
    }

    public Service(String id, String name, int type_service, float counting) {
        this.id = id;
        this.name = name;
        this.type_service = type_service;
        this.counting = counting;
    }

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

    public int getType_service() {
        return type_service;
    }

    public void setType_service(int type_service) {
        this.type_service = type_service;
    }

    public float getCounting() {
        return counting;
    }

    public void setCounting(float counting) {
        this.counting = counting;
    }
}
