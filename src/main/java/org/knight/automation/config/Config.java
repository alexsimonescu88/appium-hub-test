package org.knight.automation.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static final Properties properties = new Properties();

    static {
        String configFilePath = System.getProperty("configFile");
        try (FileInputStream fis = new FileInputStream(configFilePath)) {
            System.out.println("Loading configuration from: " + configFilePath);
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load configuration file: " + configFilePath, e);
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
