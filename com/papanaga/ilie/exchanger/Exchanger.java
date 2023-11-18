package com.papanaga.ilie.exchanger;

public class Exchanger {
    double USD = 1;
    double EUR = 1.09;
    double MDL = 0.055;
    double RON = 0.22;

    public static String[] valutes = {"USD", "EUR", "MDL", "RON"};



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