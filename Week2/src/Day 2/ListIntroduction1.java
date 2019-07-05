package com.company;

import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String... args) {


        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names.size());

        names.add("William");

            System.out.println(names.isEmpty());

            System.out.println(names);

        names.add ("John");
        names.add ("Amanda");
            System.out.println(names);
            System.out.println(names.size());
            System.out.println();


    }
}