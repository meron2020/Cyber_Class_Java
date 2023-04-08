package Grade_11.PassoverExercises.Question2;

public class Time {
    private int hour;

    public Time(int hour, int minute, int sec) {
        this.hour = hour;
        this.minute = minute;
        this.sec = sec;
    }

    private int minute;



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

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    private int sec;

}
