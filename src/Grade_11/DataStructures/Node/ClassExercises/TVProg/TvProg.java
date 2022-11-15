package Grade_11.DataStructures.Node.ClassExercises.TVProg;

import Grade_11.DataStructures.Node.Node;

public class TvProg {
    private String name;
    private int day;
    private Time start;
    private int length;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Time getStart() {
        return start;
    }

    public void setStart(Time start) {
        this.start = start;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public TvProg(String name, int day, Time start, int length) {
        this.name = name;
        this.day = day;
        this.start = start;
        this.length = length;
    }

    public TvProg() {
    }


}
