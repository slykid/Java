package com.java.kilhyun.OOP;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class ex24_14_PropertiesTest {

    public static void main(String[] args) throws Exception
    {
        Properties properties = new Properties();
        String path = ex24_14_PropertiesTest.class.getResource("database.properties").getPath();
        path = URLDecoder.decode(path, "UTF-8");
        properties.load(new FileReader(path));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver: " + driver);
        System.out.println("url: " + url);
        System.out.println("username: " + username);
        System.out.println("password: " + password);

    }

}
