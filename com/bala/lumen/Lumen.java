package com.bala.lumen;

import com.bala.lumen.features.auth.AuthView;

public class Lumen {

    public static final String appVersion = "0.0.1";
    public static final String appName = "Lumen";

    public static void main(String[] args) {
        System.out.println("Welcome to " + appName + " - Version: " + appVersion);
        new AuthView().init();
    }
}
