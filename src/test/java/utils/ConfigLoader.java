package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

    static Properties prop = new Properties();

    static {
        try {
            FileInputStream fis = new FileInputStream("config/config.properties");
            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }
    }
    public static String get(String key) {
        return prop.getProperty(key);
    }
}