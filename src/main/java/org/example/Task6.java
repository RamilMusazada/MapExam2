package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Task6 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println("Queue bosdur");
    }
}
