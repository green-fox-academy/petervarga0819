package com.company;

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a number:");
        int i = scanner.nextInt();
        int a = 0;
        for (a = 1; a <=i; a++){
            for (int j = 1; j <= a ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}