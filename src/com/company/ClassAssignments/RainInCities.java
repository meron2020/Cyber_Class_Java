package com.company.ClassAssignments;

import java.util.Scanner;

public class RainInCities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
            String maxCity = "";
            String minCity = "";
            int maxPrecipitation = 0;
            int minPrecipitation = 0;
            int total = 0;

            for (int j = 0; j < 7; j++) {
                System.out.println("Enter city name >> ");
                String city = scanner.next();
                System.out.println("Enter Precipitation Rate >> ");
                int precipitation = scanner.nextInt();
                if (j == 0) {
                    minPrecipitation = precipitation;
                    minCity = city;
                }
                else if (precipitation < minPrecipitation) {
                    minPrecipitation = precipitation;
                    minCity = city;
                }

                if (maxPrecipitation < precipitation) {
                    maxPrecipitation = precipitation;
                    maxCity = city;
                }
                total += precipitation;

            }
            System.out.println("Max city >> " + maxCity);
            System.out.println("Min city >> " + minCity);
            System.out.println("Average precipitation >> " + (total / 7));
        }
    }
}
