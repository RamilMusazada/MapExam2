package org.example;

import java.util.Random;
import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {
        TreeSet <Integer> set = new TreeSet<>();
        Random random = new Random();
        for ( int i = 0 ; i <10 ; i ++){
            int number = random.nextInt(100);
            set.add(number);
            System.out.print(number+" ");
        }
        System.out.println(set);
    }
}
