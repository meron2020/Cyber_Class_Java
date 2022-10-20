package ObjectOriented.Line;

import java.util.Scanner;

public class Program {
    public static Line longestLine(Line[] arr) {
        Line longestLine = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getLength() > longestLine.getLength()) {
                longestLine = arr[i];
            }
        }
        return longestLine;
    }

    public static int pointOnLines(Point point, Line[] lines) {
        int counter = 0;
        for (int i = 0; i < lines.length; i++) {
            if (point.checkIfSamePoint(lines[i].getPointOne()) || point.checkIfSamePoint(lines[i].getPointTwo())) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Line[] lineArray = new Line[10];
        for (int i = 0; i < lineArray.length; i++) {
            System.out.println("Enter the x coordinate for the first point >> ");
            double pointOneX = scanner.nextDouble();
            System.out.println("Enter the y coordinate for the first point >> ");
            double pointOneY = scanner.nextDouble();
            lineArray[i].setPointOne(new Point(pointOneX, pointOneY));

            System.out.println("Enter the x coordinate for the second point >> ");
            double pointTwoX = scanner.nextDouble();
            System.out.println("Enter the y coordinate for the second point >> ");
            double pointTwoY = scanner.nextDouble();
            lineArray[i].setPointTwo(new Point(pointTwoX, pointTwoY));
        }

        System.out.println(Program.longestLine(lineArray));
        System.out.println(pointOnLines(new Point(2,4), lineArray));

        int counter = 0;
        for (int i = 0; i < lineArray.length; i++) {
            if (lineArray[i].parallelToY()) {
                counter++;
            }
        }

        System.out.println(counter + " lines are parallel to the y axis.");
    }
}
