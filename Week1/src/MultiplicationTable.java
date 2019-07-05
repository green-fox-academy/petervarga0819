package com.company;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a number:");
        int number = scanner.nextInt();
        int a = 0;
        for (a = 0; a < 11; a++){
            System.out.println((a) + "*" + (number) + "=" + (number * a));
        }
    }
}