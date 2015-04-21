package com.example.sandboxy.server;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Weather implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String city;
    private String region;
    private String country;
    private String cond;
    private String temp;
    private String chill;
    private String humidity;

    public Weather() {}

    public int getId() {
        return id;
    }

    public String getChill() {
        return chill;
    }

    public String getCond() {
        return cond;
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

    public void setCond(String cond) {
        this.cond = cond;
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
                + "Condition: " + this.getCond() + " "
                + "Country: " + this.getCountry() + " "
                + "Humidity: " + this.getHumidity() + " "
                + "Region: " + this.getRegion() + " "
                + "Temp: " + this.getTemp();

        return result;
    }
}
