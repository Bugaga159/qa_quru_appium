package ru.example.config;

import org.aeonbits.owner.ConfigFactory;

public class Credentials {
    public static MobileConfig config = ConfigFactory.create(MobileConfig.class);

    public static boolean isBrowserStack() {
        return System.getProperty("device").equals("browserstack");
    }
}
