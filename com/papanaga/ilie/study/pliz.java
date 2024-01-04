package com.papanaga.ilie.study;

import java.util.Scanner;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class pliz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Do you love me?" + "\n1.Yes" + "\t2.No");
            int afirm = scanner.nextInt();

            if (afirm == 1) {
                try {
                    URI uri = new URI("http://www.porsche-code.com/PR63SSK2");
                    java.awt.Desktop.getDesktop().browse(uri);
                    System.out.println("Buy me please this:" + "\n");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            } else if (afirm == 2) {
                System.out.println("!?!?" + "\n");
            } else {
                System.out.println("Don't try to fool me"+ "\n");
            }
        }
    }
}
