package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(8);
        list.add(5);
        list.add(3);
        list.add(2);
        List<Integer> cutEdedler = list.stream()
                .filter(num-> num %  2== 0)
                .collect(Collectors.toList());
        System.out.println(cutEdedler);
    }
}
