package plygrnd.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Settings {
    public static boolean DEBUG = false;
    public static Properties settings;

    /*
    Load settings from config.properties
     */

    public static void load() {
        try {
            settings = new Properties();
            FileInputStream fs = new FileInputStream("config.properties");
            settings.load(fs);
            fs.close();
        } catch (IOException e) {
            System.out.println("Could not load config.properties");
            throw new RuntimeException(e);
        }
    }
}
