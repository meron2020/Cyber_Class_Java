package Grade_11.DataStructures.Node.BookQuestions.Page_102.Q_57;

import Grade_11.DataStructures.Node.Node;

public class Program {
    public static void averageOfEachStudent(Node<Student> students) {
        Node<Student> currentStudent = students;
        while (currentStudent != null) {
            int courseCounter = 0;
            int sum = 0;
            Node<Score> currentScore = currentStudent.getValue().getScores();
            while (currentScore != null) {
                sum += currentScore.getValue().getScore();
                courseCounter++;
                currentScore = currentScore.getNext();
            }
            System.out.println(currentStudent.getValue().getName() + ": " + sum / courseCounter);
            currentStudent = currentStudent.getNext();
        }
    }

    public static Node<Course> addScoreToCourse(Node<Score> courseScoreToAdd, Node<Course> courses) {
        Node<Course> courseToCheck = courses;
        while (courseToCheck.getNext() != null) {
            if (courseToCheck.getNext().getValue().getCourseId() == courseScoreToAdd.getValue().getCourseId()) {
                courseToCheck.getNext().getValue().addScore(courseScoreToAdd.getValue().getScore());
                return courseToCheck;
            }
            courseToCheck = courseToCheck.getNext();
        }

        courseToCheck.setNext(new Node<Course>(new Course(courseScoreToAdd.getValue().getCourseId())));
        return courses;
    }

    public static Node<Course> addStudentScoresToCourses(Student student, Node<Course> courses) {
        Node<Score> currentScoreToAdd = student.getScores();
        while (currentScoreToAdd != null) {
            courses = addScoreToCourse(currentScoreToAdd, courses);
            currentScoreToAdd = currentScoreToAdd.getNext();
        }
        return courses;

    }

    public static int courseWithHighestScore(Node<Student> students) {
        Node<Course> courses = new Node<Course>(new Course(1234));
        Node<Student> currentStudent = students;
        while (currentStudent != null) {
            courses = addStudentScoresToCourses(currentStudent.getValue(), courses);
            currentStudent = currentStudent.getNext();
        }
        courses = courses.getNext();
        int largestAverageScore = courses.getValue().getCourseAverage();
        while (courses != null) {
            if (largestAverageScore < courses.getValue().getCourseAverage()) {
                largestAverageScore = courses.getValue().getCourseAverage();
            }
            courses = courses.getNext();
        }
        return largestAverageScore;
    }
}
