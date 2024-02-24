package org.example;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Toy> queue = new PriorityQueue<>();

        for (int i = 1; i<11; i++){
            int value = new Random().nextInt(1,10);

            if (value<2){
                queue.add(new Toy(i, "Конструктор", 2));
            } else if (value<6) {
                queue.add(new Toy(i, "Робот", 2));
            }else {
                queue.add(new Toy(i, "Кукла", 6));
            }
        }

        QueueWriter.write(queue);
    }
}