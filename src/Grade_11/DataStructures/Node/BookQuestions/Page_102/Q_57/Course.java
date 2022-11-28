package Grade_11.DataStructures.Node.BookQuestions.Page_102.Q_57;

public class Course {
    public int getCourseId() {
        return courseId;
    }

    public Course(int courseId) {
        this.courseId = courseId;
        this.scores = new int[1];
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    private int courseId;
    private int[] scores;

    public void addScore(int score) {
        int[] newScores = new int[this.scores.length + 1];
        for (int i = 0; i < scores.length; i++) {
            newScores[i] = scores[i];
        }
        newScores[this.scores.length] = score;

        this.scores = newScores;

    }

    public int getCourseAverage() {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum / scores.length;
    }
}
