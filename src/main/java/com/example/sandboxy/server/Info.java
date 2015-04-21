package com.example.sandboxy.server;

import java.io.InputStream;
import java.io.Serializable;


/**
 * Created by anano.bodokia on 4/15/2015.
 */
public class Info  implements Serializable{
    public Info(){}
    public static Weather start(String zip) throws Exception {
        InputStream dataIn = new YahooRetriever().retrieve(zip);
        Weather weather = new YahooParser().parse(dataIn);
        return weather;
    }
}

