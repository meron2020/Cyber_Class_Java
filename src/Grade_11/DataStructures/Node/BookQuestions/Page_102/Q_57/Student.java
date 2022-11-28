package Grade_11.DataStructures.Node.BookQuestions.Page_102.Q_57;

import Grade_11.DataStructures.Node.Node;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, int id, int year, Node<Score> scores) {
        this.name = name;
        Id = id;
        this.year = year;
        this.scores = scores;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Node<Score> getScores() {
        return scores;
    }

    public void setScores(Node<Score> scores) {
        this.scores = scores;
    }

    private String name;
    private int Id;
    private int year;
    private Node<Score> scores;


}
