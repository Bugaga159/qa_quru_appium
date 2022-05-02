package ru.example.config;

import org.aeonbits.owner.ConfigFactory;

public class Credentials {
    public static CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);
}
