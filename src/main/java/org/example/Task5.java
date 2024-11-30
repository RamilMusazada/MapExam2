package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Honor");
        list.add("Pixel");
        list.add("Xiaomi");
        list.add("Samsung");
        List<Integer> length = list.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(length);
    }
}
