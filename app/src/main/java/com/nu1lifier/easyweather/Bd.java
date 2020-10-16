package com.nu1lifier.easyweather;

import java.io.Serializable;

public class Bd implements Serializable {
    public String text;

    public String getCity(String s) {
        return text;
    }

    public String getCity() {
        return text;
    }

    public void setCity(String city) {
        this.text = city;
    }
}
