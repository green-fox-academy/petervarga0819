package com.company;
public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
            int a = (24 - currentHours);
            int b = (60 - currentMinutes);
            int c = (60 - currentSeconds);
            int d = (a * 60 * 60 + b * 60 + c);
            System.out.println(d + " remaining seconds");
        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables



    }
}