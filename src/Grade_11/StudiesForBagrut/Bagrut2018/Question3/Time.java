package Grade_11.StudiesForBagrut.Bagrut2018.Question3;

public class Time {
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int hour;
    public int minute;

    public Time(int hour, int minute) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
    }

}
