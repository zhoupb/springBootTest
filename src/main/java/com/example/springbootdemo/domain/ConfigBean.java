package com.example.springbootdemo.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com.dudu")
public class ConfigBean {

    private String name;
    private String want;
    private String double1;

    public String getDouble1() {
        return double1;
    }

    public void setDouble1(String double1) {
        this.double1 = double1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWant() {
        return want;
    }

    public void setWant(String want) {
        this.want = want;
    }
}
