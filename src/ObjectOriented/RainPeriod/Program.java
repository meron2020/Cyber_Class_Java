package ObjectOriented.RainPeriod;

import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);
    public static RainPeriod[] createYear() {
        RainPeriod[] rainInYear = new RainPeriod[12];
        for (int i = 1; i < rainInYear.length + 1; i++) {
            int[] rainInMonthArr = new int[32];
            for (int j = 1; j < rainInYear[i].getDayNum().length; j++) {
                rainInMonthArr[j] = scanner.nextInt();
            }
            rainInYear[i].setDayNum(rainInMonthArr);
            rainInYear[i].setMonthNum(i);
        }
        return rainInYear;
    }

    public static double averageRainInMonth(RainPeriod[] rainInYear) {
        double sum = 0;
        for (int i = 0; i < rainInYear.length; i++) {
            sum += rainInYear[i].amountOfRainFallen();
        }
        return sum / rainInYear.length;
    }

    public static int moreThanTenMilPerDay(RainPeriod[] rainInYear) {
        int counter = 0;
        for (int i = 0; i < rainInYear.length; i++) {
            RainPeriod rainMonth = rainInYear[i];
            for (int k = 0; k < rainMonth.getDayNum().length; k++) {
                if (rainMonth.getDayNum()[k] > 10) {
                    counter++;
                }
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        RainPeriod[] rainInYear = createYear();
        System.out.println(Program.averageRainInMonth(rainInYear));
        System.out.println(Program.moreThanTenMilPerDay(rainInYear));
    }
}
