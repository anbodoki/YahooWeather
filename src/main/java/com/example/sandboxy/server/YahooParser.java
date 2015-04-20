package com.example.sandboxy.server;

import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by anano.bodokia on 4/15/2015.
 */
public class YahooParser {

    public Weather parse(InputStream inputStream) throws Exception {
        Weather weather = new Weather();


        SAXReader xmlReader = createXmlReader();
        Document doc = xmlReader.read( inputStream );

        weather.setCity(
                doc.valueOf("/rss/channel/y:location/@city") );
        weather.setRegion(
                doc.valueOf("/rss/channel/y:location/@region") );
        weather.setCountry(
                doc.valueOf("/rss/channel/y:location/@country") );
        weather.setCondition(
                doc.valueOf("/rss/channel/item/y:condition/@text") );
        weather.setTemp(
                doc.valueOf("/rss/channel/item/y:condition/@temp") );
        weather.setChill(
                doc.valueOf("/rss/channel/y:wind/@chill") );
        weather.setHumidity(
                doc.valueOf("/rss/channel/y:atmosphere/@humidity") );

        return weather;
    }

    private SAXReader createXmlReader() {
        Map<String,String> uris = new HashMap<String,String>();
        uris.put( "y", "http://xml.weather.yahoo.com/ns/rss/1.0" );

        DocumentFactory factory = new DocumentFactory();
        factory.setXPathNamespaceURIs( uris );

        SAXReader xmlReader = new SAXReader();
        xmlReader.setDocumentFactory( factory );
        return xmlReader;
    }
}
