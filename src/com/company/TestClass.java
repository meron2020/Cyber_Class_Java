package com.company;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        for (int mechane = 10; mechane < 100; mechane++) {
            int mechaneAhadot = mechane % 10;
            if (mechaneAhadot == 0) {
                continue;
            }
            int mechaneAsarot = mechane / 10;
            for (int mone = 10; mone<mechane; mone++) {
                int moneAhadot = mone % 10;
                int moneAsarot = mone / 10;
                if (moneAhadot == mechaneAsarot) {
                    int fullFraction = mone / mechane;
                    int smallerFraction = moneAsarot / mechaneAhadot;
                    if (fullFraction == smallerFraction) {
                        System.out.println(mone + "/" + mechane + "=" + moneAsarot + "/" + mechaneAhadot);
                    }
                }
            }
        }
    }
}
