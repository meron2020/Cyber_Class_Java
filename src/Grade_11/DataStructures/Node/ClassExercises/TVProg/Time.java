package Grade_11.DataStructures.Node.ClassExercises.TVProg;

public class Time {
    public int hour;
    public int minutes;

    public Time(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    public Time add(int x) {
        int t = hour * 60 + minutes + x;
        return new Time(t / 60, t % 60);
    }
}
