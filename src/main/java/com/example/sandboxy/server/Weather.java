package com.example.sandboxy.server;

import java.io.Serializable;

/**
 * Created by anano.bodokia on 4/15/2015.
 */
public class Weather implements Serializable{
    private Integer id;
    private String city;
    private String region;
    private String country;
    private String condition;
    private String temp;
    private String chill;
    private String humidity;

    private static int COUNTER = 0;

    public Weather() {
        this.id = Integer.valueOf(COUNTER++);
    }

    public Integer getId() {
        return id;
    }

    public String getChill() {
        return chill;
    }

    public String getCondition() {
        return condition;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getRegion() {
        return region;
    }

    public String getTemp() {
        return temp;
    }

    public void setChill(String chill) {
        this.chill = chill;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        String result = "Chill: " + this.getChill() + " "
                + "City: " + this.getCity() + " "
                + "Condition: " + this.getCondition() + " "
                + "Country: " + this.getCountry() + " "
                + "Humidity: " + this.getHumidity() + " "
                + "Region: " + this.getRegion() + " "
                + "Temp: " + this.getTemp();

        return result;
    }
}
