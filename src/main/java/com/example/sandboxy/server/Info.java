package com.example.sandboxy.server;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.io.InputStream;


/**
 * Created by anano.bodokia on 4/15/2015.
 */
public class Info implements IsSerializable{
    public static String start(String zip) throws Exception {
        InputStream dataIn = new YahooRetriever().retrieve(zip);
        Weather weather = new YahooParser().parse(dataIn);
        String result = weather.toString();
        return result;
    }
}

