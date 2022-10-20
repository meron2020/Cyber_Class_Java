package ObjectOriented.Line;

public class Line {
    Point pointOne;
    Point pointTwo;

    public Point getPointOne() {
        return pointOne;
    }

    public Point getPointTwo() {
        return pointTwo;
    }

    public void setPointOne(Point pointOne) {
        this.pointOne = pointOne;
    }

    public void setPointTwo(Point pointTwo) {
        this.pointTwo = pointTwo;
    }


    public Line(Point pointOne, Point pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }

    @Override
    public String toString() {
        return "Line{" +
                "pointOne=" + pointOne +
                ", pointTwo=" + pointTwo +
                '}';
    }

    public double getLength() {
        return pointOne.distance(pointTwo);
    }

    public boolean parallelToY() {
        return pointOne.getX() == pointTwo.getX();
    }
}
