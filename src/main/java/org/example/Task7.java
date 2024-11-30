package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> words = new ArrayList<>();
        System.out.println("Enter the words : ");
        while (true) {
            String word = scanner.nextLine();
            if (word.equals("stop")) {
                break;
            }
            words.add(word);
        }
        List <String> palindromelist = new ArrayList<>();
        for (String word : words){
            if (palindrome(word)){
                palindromelist.add(word);
            }
        }
        System.out.println(palindromelist);
    }
    public static boolean palindrome(String word){
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);

    }
}
