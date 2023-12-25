package org.example.app;

import java.util.Locale;
import java.util.Scanner;
import org.example.app.service.BonusService;

public class App {
    static Scanner scanner;
    private static final String CURRENCY = "EUR";

    public App() {
    }

    public static void main(String[] args) {
        getOutput(getBonus(getData()));
    }

    static double getData() {
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("Enter sales, EUR: ");
        return scanner.nextDouble();
    }

    static String getBonus(double sales) {
        return (new BonusService()).getRes(sales);
    }

    static void getOutput(String output) {
        scanner.close();
        System.out.println("Bonus is EUR " + output);
    }

    static {
        scanner = new Scanner(System.in);
    }
}