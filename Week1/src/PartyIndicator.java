package com.company;
    import java.util.Scanner;

        public class PartyIndicator {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Add the number of girls:");
            int girls = scanner.nextInt();
            System.out.println("Add the number of boys:");
            int boys = scanner.nextInt();

            if (girls == boys && girls + boys > 20){
                System.out.println("The party is excellent!");
            } else if (girls != boys && girls > 0 && girls + boys > 20){
                System.out.println("Quite cool party!");
            } else if (girls + boys < 20){
                System.out.println("Average party...");
            } else if (girls == 0){
                System.out.println("Sausage party");
            } else {
                System.out.println();
            }

        }
    }

