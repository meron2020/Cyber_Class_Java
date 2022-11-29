package Grade_11.DataStructures.Node.BookQuestions.Page_102.Q_57;

import Grade_11.DataStructures.NodeClass;

public class Program {
    public static void averageOfEachStudent(NodeClass<Student> students) {
        NodeClass<Student> currentStudent = students;
        while (currentStudent != null) {
            int courseCounter = 0;
            int sum = 0;
            NodeClass<Score> currentScore = currentStudent.getValue().getScores();
            while (currentScore != null) {
                sum += currentScore.getValue().getScore();
                courseCounter++;
                currentScore = currentScore.getNext();
            }
            System.out.println(currentStudent.getValue().getName() + ": " + sum / courseCounter);
            currentStudent = currentStudent.getNext();
        }
    }

    public static NodeClass<Course> addScoreToCourse(NodeClass<Score> courseScoreToAdd, NodeClass<Course> courses) {
        NodeClass<Course> courseToCheck = courses;
        while (courseToCheck.getNext() != null) {
            if (courseToCheck.getNext().getValue().getCourseId() == courseScoreToAdd.getValue().getCourseId()) {
                courseToCheck.getNext().getValue().addScore(courseScoreToAdd.getValue().getScore());
                return courseToCheck;
            }
            courseToCheck = courseToCheck.getNext();
        }

        courseToCheck.setNext(new NodeClass<Course>(new Course(courseScoreToAdd.getValue().getCourseId())));
        return courses;
    }

    public static NodeClass<Course> addStudentScoresToCourses(Student student, NodeClass<Course> courses) {
        NodeClass<Score> currentScoreToAdd = student.getScores();
        while (currentScoreToAdd != null) {
            courses = addScoreToCourse(currentScoreToAdd, courses);
            currentScoreToAdd = currentScoreToAdd.getNext();
        }
        return courses;

    }

    public static int courseWithHighestScore(NodeClass<Student> students) {
        NodeClass<Course> courses = new NodeClass<Course>(new Course(1234));
        NodeClass<Student> currentStudent = students;
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
