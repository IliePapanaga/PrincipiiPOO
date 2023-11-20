package com.papanaga.ilie.study;

import java.util.Scanner;

public class Array {
    public static String[] OS = {"MacOS", "Windows", "Linux", "Ubuntu"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select your OS:");
        for (String os : OS) {
            System.out.println(os);
        }
        short inputOS = scanner.nextShort();
        System.out.println(OS[inputOS-1]);
    }
}
