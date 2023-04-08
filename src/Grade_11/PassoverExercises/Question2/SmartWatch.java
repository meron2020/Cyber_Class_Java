package Grade_11.PassoverExercises.Question2;

public class SmartWatch {
    public Time now;
    public Practice[] arr;
    public int numP;

    public boolean addPractice(String type) {
        if (numP < arr.length) {
            arr[numP] = new Practice(type, now);
            numP += 1;
            return true;
        }
        return false;
    }

    public int totalCaloriesBurned() {
        int sum = 0;
        for (int i = 0; i < numP; i++) {
            if (arr[i].getEnd() != null) {
                sum += arr[i].getCalories();
            }
        }
        return sum;
    }

    public Time totalTimeTraining() {
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        for (int i = 0; i < numP; i++) {
            if (arr[i].getEnd() != null) {
                Time practiceLength = arr[i].practiceLength();
                hours += practiceLength.getHour();
                minutes += practiceLength.getMinute();
                seconds += practiceLength.getSec();
            }
        }
        minutes = seconds / 60;
        seconds = seconds % 60;
        hours += minutes / 60;
        minutes = minutes % 60;
        return new Time(hours, minutes, seconds);
    }
}
