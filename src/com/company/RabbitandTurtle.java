package com.company;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

class AnimalsThread extends Thread {


    public AnimalsThread(String name, int newPriority) {
        this.name = name;
        this.newPriority = newPriority;
    }

    int finish = 1100;
    int distance = -100;
    int newPriority;
    String name;

    public void run() {
        for (int i = 0; i < finish; i += 100) {
            distance += 100;
            AnimalsThread.currentThread().setPriority(newPriority);
            System.out.println(name + "Пробежал(а): " + distance + " метров");
        }
    }
}
public class RabbitandTurtle {

    public static void main(String[] args) {
        AnimalsThread rabbit = new AnimalsThread("Кролик", MIN_PRIORITY);
        AnimalsThread turtle = new AnimalsThread("черепаха", MAX_PRIORITY);
        rabbit.start();
        turtle.start();
    }
}