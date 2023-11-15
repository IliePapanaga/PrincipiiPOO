package com.papanaga.ilie.exchanger;
import java.util.Scanner;

public class Exchanger {
    double USD = 1;
    double EUR = 1.09;
    double MDL = 0.055;
    double RON = 0.22;

    public static String[] valutes = {"USD", "EUR", "MDL", "RON"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select your source valute:");
        for (int i = 0; i < valutes.length; i++) {
            System.out.println((i + 1) + ". " + valutes[i]);
        }

        short inputA = scanner.nextShort();
        String sourceCurrency = valutes[inputA - 1];
        System.out.println("Selected source valute: " + sourceCurrency);

        System.out.println("Select your target valute:");
        for (int i = 0; i < valutes.length; i++) {
            System.out.println((i + 1) + ". " + valutes[i]);
        }

        short inputB = scanner.nextShort();
        String targetCurrency = valutes[inputB - 1];
        System.out.println("Selected target valute: " + targetCurrency);

        System.out.println("Enter the amount to exchange:");
        double amount = scanner.nextDouble();

        double result = convertCurrency(amount, sourceCurrency, targetCurrency);
        System.out.println("Result: " + result + " " + targetCurrency);
    }


    public static double convertCurrency(double amount, String sourceCurrency, String targetCurrency) {
        Exchanger exchanger = new Exchanger();
        double sourceRate = exchanger.getRate(sourceCurrency);
        double targetRate = exchanger.getRate(targetCurrency);
        return amount * 1/(targetRate / sourceRate);
    }

    public double getRate(String currency) {
        switch (currency) {
            case "USD":
                return USD;
            case "EUR":
                return EUR;
            case "MDL":
                return MDL;
            case "RON":
                return RON;
            default:
                throw new IllegalArgumentException("Invalid currency: " + currency);
        }
    }
}