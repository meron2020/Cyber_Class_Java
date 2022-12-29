package Grade_11.StudiesForTests.EnglishSchool;

public class EnglishLevel {
    private int level;
    private int type;

    public EnglishLevel(int level, int type) {
        this.level = level;
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
