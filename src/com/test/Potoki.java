package com.test;

import java.util.Random;

public class Potoki{
    public static void main(String[] args) {
        new Potok1().start();
        new Potok2().start();
        new Potok3().start();

        System.out.println("This is method main()");
    }

static class Potok1 extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                System.out.println(ConsoleColors.GREEN + Thread.currentThread().getName() + " - " + i);
                try {
                    Thread.sleep(new Random().nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Potok2 extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                System.out.println(ConsoleColors.PURPLE + Thread.currentThread().getName() + " - " + i);
                try {
                    Thread.sleep(new Random().nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Potok3 extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                System.out.println(ConsoleColors.RED + Thread.currentThread().getName() + " - " + i);
                try {
                    Thread.sleep(new Random().nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}