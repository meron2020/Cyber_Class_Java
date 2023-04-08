package Grade_11.PassoverExercises.Question2;

public class Practice {
    private String type;
    private Time start;
    private Time end;

    public Practice(String type, Time start) {}
    public void setEnd(Time end) {}
    public int getCalories() {return 0;}

    public Time getEnd() {
        return end;
    }

    public Time practiceLength() {
        return new Time((end.getHour() - start.getHour()), end.getMinute() - start.getMinute(),
                end.getSec() - start.getSec());
    }
}
