package com.company.NestedForLoops;

public class DigitalClock {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                for (int n = 0; n < 60; n++) {
                    System.out.print(i + " : " + j + " : " + n);
                    Thread.sleep(1000);
                    System.out.println();
                }
            }

        }
    }
}
