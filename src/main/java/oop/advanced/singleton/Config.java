package oop.advanced.singleton;

import io.github.cdimascio.dotenv.Dotenv;

public class Config {

    private static Dotenv env = Dotenv.load();

    // загружаем в момент старта программы
    static String adminLogin = env.get("ADMIN_LOGIN");
    static String adminPassword = env.get("adminPassword");
    static String baseUrl = env.get("baseUrl");
    static int maxTime = Integer.parseInt(env.get("maxTime"));
}