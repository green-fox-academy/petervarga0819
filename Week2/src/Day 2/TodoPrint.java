package com.company;

public class TodoPrint {
    public static void main(String... args){
            String todoText = " - Buy milk\n";
            // Add "My todo:" to the beginning of the todoText
            // Add " - Download games" to the end of the todoText
            // Add " - Diablo" to the end of the todoText but with indention

            // Expected outpt:

            // My todo:
            //  - Buy milk
            //  - Download games
            //      - Diablo

            todoText = "My todo:\n" + todoText;
            todoText = todoText + " - Download games";
            todoText = todoText + "\n\t - Doablo";

            System.out.println(todoText);
        }
    }




