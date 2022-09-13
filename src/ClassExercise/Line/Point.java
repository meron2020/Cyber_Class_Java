package ClassExercise.Line;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean checkIfSamePoint(Point point) {
        return point.getX() == getX() && point.getY()== getY();
    }

    public double distance(Point point2) {
        return Math.sqrt(Math.pow(getX() - point2.getX(), 2) + Math.pow(getY() - point2.getY(), 2));
    }

}
