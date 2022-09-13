package ClassExercise.Line;

public class Program {
    public Line longestLine(Line[] arr) {
        Line longestLine = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getLength() > longestLine.getLength()) {
                longestLine = arr[i];
            }
        }
        return longestLine;
    }

    public int pointOnLines(Point point, Line[] lines) {
        int counter = 0;
        for (int i = 0; i < lines.length; i++) {
            if (point.checkIfSamePoint(lines[i].getPointOne()) || point.checkIfSamePoint(lines[i].getPointTwo())) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

    }
}
