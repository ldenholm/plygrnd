package plygrnd;

import plygrnd.util.Settings;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(Settings.settings.getProperty("in-vm"));
    }
}