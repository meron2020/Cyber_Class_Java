package ClassExercise.Megamot;

public class Megamot {

    private String schoolName;
    private int[] megamotList;

    public Megamot(String schoolName) {
        this.schoolName = schoolName;
        this.megamotList = new int[5];
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int[] getMegamotList() {
        return megamotList;
    }

    public void setMegamotList(int[] megamotList) {
        this.megamotList = megamotList;
    }

    public void addStudentToMegama(int megamaNum) {
        this.megamotList[megamaNum - 1] += 1;
    }

    public void subtractStudentFromMegama(int megamaNum) {
        this.megamotList[megamaNum - 1] -= 1;
    }

    public int amountOfStudents(int megamaNum) {
        return this.megamotList[megamaNum];
    }

    @Override
    public String toString() {
        return "School Name >> " + this.schoolName + "\n" +
                "Software Engineering >> " + this.megamotList[0] + "\n" +
                "Art >> " + this.megamotList[1] + "\n" +
                "Graphics Design >> " + this.megamotList[2] + "\n" +
                "Medicine >> " + this.megamotList[3] + "\n" +
                "Robotics >> " + this.megamotList[4] + "\n";
    }
}
