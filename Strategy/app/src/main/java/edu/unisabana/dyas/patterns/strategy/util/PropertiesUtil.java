package edu.unisabana.dyas.patterns.strategy.util;

import java.io.InputStream;
import java.util.Properties;

/**
 @author cesarvefe
 
 */
public class PropertiesUtil {
    public static Properties loadProperty(String propertiesURL){
        try {
            Properties properties = new Properties();
            InputStream inputStream = PropertiesUtil.class.getClassLoader().getResourceAsStream(propertiesURL);
            properties.load(inputStream);
            return properties;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}