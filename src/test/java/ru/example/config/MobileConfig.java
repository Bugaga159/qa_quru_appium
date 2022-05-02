package ru.example.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"classpath:config/${device}.properties",
        "classpath:config/emulator.properties",
        "system:properties",})
public interface MobileConfig extends Config {
    @Key("deviceName")
    @DefaultValue("Pixel_4")
    String deviceName();
    String platformName();
    @Key("platformVersion")
    @DefaultValue("11.0")
    String platformVersion();

    String user();
    String key();
    String app();
    String url();
}
