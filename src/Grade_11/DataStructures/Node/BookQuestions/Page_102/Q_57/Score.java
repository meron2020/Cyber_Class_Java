package Grade_11.DataStructures.Node.BookQuestions.Page_102.Q_57;

public class Score {
    public Score(int courseId, int score) {
        this.courseId = courseId;
        this.score = score;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private int courseId;
    private int score;

}
