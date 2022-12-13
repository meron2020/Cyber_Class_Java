package Grade_11.DataStructures.Node.ClassExercises.Birthday;

public class Birthday {
    public Birthday(String name, int day) {
        this.name = name;
        this.day = day;
    }

    private String name;

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

    int day;

    public boolean same(Birthday other) {
        return this.day == other.day && this.name.equals(other.name);
    }
}
