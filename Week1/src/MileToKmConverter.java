package com.company;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Distance in mile:");
        double userInput1 = scanner.nextDouble();
        System.out.println("Distance in km: " + userInput1 * 1.6);


    }
}