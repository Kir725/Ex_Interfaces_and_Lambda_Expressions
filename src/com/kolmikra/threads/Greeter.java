package com.kolmikra.threads;

import java.util.ArrayList;

public class Greeter implements Runnable {
    private int count;
    private String target;

    public Greeter(int count, String target) {
        this.count = count;
        this.target = target;
    }

    public static void runTogether(Runnable... tasks) {
        for (Runnable task : tasks) {
            new Thread(task).start();
        }
    }

    public static void runInOrder(Runnable... tasks) {
        for (Runnable task : tasks) {
            task.run();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello, " + target);
        }
    }
}
