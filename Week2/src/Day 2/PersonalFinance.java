package com.company;

import java.util.ArrayList;

public class PersonalFinance {


    public static void main(String... args) {
        ArrayList<Integer> pf = new ArrayList<Integer>();


        pf.add(500);
        pf.add(1000);
        pf.add(1250);
        pf.add(175);
        pf.add(800);
        pf.add(120);

        int someArray[] = {1000, 120, 800, 175, 500, 1250};
        int sum = 0;

        for (int i : pf)
            sum += i;
        System.out.println(sum);


    }

}