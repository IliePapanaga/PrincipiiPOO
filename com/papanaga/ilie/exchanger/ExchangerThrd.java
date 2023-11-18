package com.papanaga.ilie.exchanger;

import java.util.Scanner;

public class ExchangerThrd extends Exchanger {
    public static void main(String[] args) {
        ExchangerThrd thread = new ExchangerThrd();
        thread.run();
    }

    public void run() {
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

        // Assuming you have a convertCurrency method implemented or imported
        double result = convertCurrency(amount, sourceCurrency, targetCurrency);
        System.out.println("Result: " + result + " " + targetCurrency);
    }

    // You need to implement or import the convertCurrency method here
    // For example:
    public static double convertCurrency(double amount, String sourceCurrency, String targetCurrency) {
        Exchanger exchanger = new Exchanger();
        double sourceRate = exchanger.getRate(sourceCurrency);
        double targetRate = exchanger.getRate(targetCurrency);
        return amount * 1/(targetRate / sourceRate);
    }
}
