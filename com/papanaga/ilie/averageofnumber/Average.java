package com.papanaga.ilie.averageofnumber;

import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        String   answer = "1";
        while (answer.equals("1")) {
            System.out.print("Enter a number: ");
            double num = input.nextDouble();
            sum += num;
            count++;
            System.out.print("Do you want to enter more numbers? \n1. Yes \t2.No \n ");
            answer = input.next();
        }
        double average = sum / count;
        System.out.println("The average of the entered numbers is: " + average);
    }
}
