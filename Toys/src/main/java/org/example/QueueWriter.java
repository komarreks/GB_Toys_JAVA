package org.example;

import java.awt.color.ProfileDataException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;

public class QueueWriter {
    public static void write(PriorityQueue<Toy> queue){
        try(FileWriter fw = new FileWriter("queue.txt")){
            StringBuilder sb = new StringBuilder();
            String s = null;
            while (queue.peek()!=null){
                sb.append(queue.poll().toString() + "\n");
            }

            fw.write(sb.toString());

            fw.flush();
        }catch (IOException e){
            System.out.println("Возникла ошибка записи файла");
        }


    }
}
