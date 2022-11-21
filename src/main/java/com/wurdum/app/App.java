package com.wurdum.app;

import com.google.inject.Guice;
import com.google.inject.Injector;

import java.io.IOException;
import java.util.Properties;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Properties prop = new Properties();
        var is = App.class.getResourceAsStream("/application.properties");
        try {
            prop.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Injector injector = Guice.createInjector();

        System.out.printf("Hello %s!!!", prop.getProperty("name"));
    }
}
