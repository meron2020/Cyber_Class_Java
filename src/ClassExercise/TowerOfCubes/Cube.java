package ClassExercise.TowerOfCubes;

public class Cube {
    private double sideLength;
    private String cubeColor;

    public Cube(double sideLength, String cubeColor) {
        this.cubeColor = cubeColor;
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "This is a cube with a side length of " + sideLength + " and a color of " + cubeColor + ".";
    }

    public boolean equals(Cube cube) {
        return this.cubeColor.equals(cube.getCubeColor()) && this.sideLength == cube.getSideLength();
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public String getCubeColor() {
        return cubeColor;
    }

    public void setCubeColor(String cubeColor) {
        this.cubeColor = cubeColor;
    }


}
