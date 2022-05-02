package ru.example.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/browserstack.properties"})
public interface CredentialsConfig extends Config {
    String user();
    String key();
    String app();
    String url();
}
