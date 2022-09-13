package ClassExercise.Driver;

import ClassExercise.Driver.Driver;

public class Program {
    public static int howManyDriversUnderAge(Driver[] drivers) {
        int underAgeCounter = 0;
        for (int i = 0; i < drivers.length; i++) {
            if (drivers[i].checkIfSpeedLimit()) {
                underAgeCounter++;
            }
        }
        return underAgeCounter;
    }

    public static double averageAge(Driver[] drivers) {
        double ageSum = 0;
        for (int i = 0; i < drivers.length; i++) {
            ageSum += drivers[i].getAge();
        }

        return ageSum / drivers.length;
    }

    public static void checkVeteranDrivers(Driver[] drivers, double averageAge) {
        for (int i = 0; i < drivers.length; i++) {
            Driver driver = drivers[i];
            if (driver.getAge() >= averageAge + 5) {
                System.out.println(driver.getName());
            }
        }
    }

    public static void presentDrivers(Driver[] drivers) {
        System.out.println(howManyDriversUnderAge(drivers));
        double averageAge = averageAge(drivers);
        System.out.println(averageAge);
        checkVeteranDrivers(drivers, averageAge);
    }
}
