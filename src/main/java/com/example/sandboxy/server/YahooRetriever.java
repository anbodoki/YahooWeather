package com.example.sandboxy.server;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by anano.bodokia on 4/15/2015.
 */
public class YahooRetriever {


    public InputStream retrieve(String zipcode) throws Exception {

        String url = "http://weather.yahooapis.com/forecastrss?p="
                + zipcode;
        URLConnection conn = new URL(url).openConnection();
        return conn.getInputStream();
    }
}
