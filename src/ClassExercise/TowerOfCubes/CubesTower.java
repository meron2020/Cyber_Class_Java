package ClassExercise.TowerOfCubes;

import java.util.Arrays;
import java.util.Scanner;

public class CubesTower {
    Scanner scanner = new Scanner(System.in);


    private int maxCubes;
    private int amountOfCubes;
    private Cube[] stackedCubes;

    public CubesTower(int maxCubes) {
        this.maxCubes = maxCubes;
        amountOfCubes = 0;
        stackedCubes = new Cube[maxCubes];
    }

    public static boolean checkIfColorInCubesTower(CubesTower cubesTower, String color) {
        for (int i = 0; i < cubesTower.amountOfCubes; i++) {
            if (cubesTower.stackedCubes[i].getCubeColor().equals(color)) {
                return true;
            }
        }
        return false;
    }

    public static CubesTower createDiverseColorTower(CubesTower towerToCheck) {
        CubesTower newTower = new CubesTower(towerToCheck.getAmountOfCubes());
        for (int i = 0; i < towerToCheck.amountOfCubes; i++) {
            Cube currentCube = towerToCheck.stackedCubes[i];
            if (!checkIfColorInCubesTower(newTower, currentCube.getCubeColor())) {
                Cube newCube = new Cube(currentCube.getSideLength(), currentCube.getCubeColor());
                newTower.addCube(newCube);
            }
            towerToCheck.removeCube();
        }
        return newTower;
    }

    @Override
    public String toString() {
        return "CubesTower{" +
                "maxCubes=" + maxCubes +
                ", amountOfCubes=" + amountOfCubes +
                ", stackedCubes=" + Arrays.toString(stackedCubes) +
                '}';
    }

    public boolean equals(CubesTower cubesTower) {
        if (cubesTower.amountOfCubes == this.amountOfCubes) {
            for (int i = 0; i < amountOfCubes; i++) {
                if (!stackedCubes[i].equals(cubesTower.stackedCubes[i])) {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public boolean userRemoveCube() {
        boolean response = removeCube();
        if (!response) {
            System.out.println("Unable to remove cube.");
        }
        return response;
    }

    public boolean userAddCube() {
        System.out.println("Enter cube color >> ");
        String color = scanner.next();
        System.out.println("Enter cube side length >>");
        double sideLength = scanner.nextDouble();
        boolean response = addCube(new Cube(sideLength, color));
        if (!response) {
            System.out.println("Unable to add cube.");
        }
        return response;
    }

    public boolean addCube(Cube cube) {
        if (!checkIfStackFull()) {
            stackedCubes[amountOfCubes] = cube;
            amountOfCubes++;
            return true;
        }

        return false;
    }

    public boolean removeCube() {
        if (!checkIfStackEmpty()) {
            stackedCubes[amountOfCubes - 1] = null;
            amountOfCubes -= 1;
            return true;
        }
        return false;
    }

    public boolean checkIfStackEmpty() {
        return stackedCubes.length == 0;
    }

    public boolean checkIfStackFull() {
        return stackedCubes.length == maxCubes;
    }

    public boolean checkIfColorInStack(String color) {
        for (int i = 0; i < amountOfCubes; i++) {
            if (stackedCubes[i].getCubeColor().equals(color)) {
                return true;
            }
        }
        return false;
    }

    public int getMaxCubes() {
        return maxCubes;
    }

    public void setMaxCubes(int maxCubes) {
        this.maxCubes = maxCubes;
    }

    public int getAmountOfCubes() {
        return amountOfCubes;
    }

    public void setAmountOfCubes(int amountOfCubes) {
        this.amountOfCubes = amountOfCubes;
    }

    public Cube[] getStackedCubes() {
        return stackedCubes;
    }

    public void setStackedCubes(Cube[] stackedCubes) {
        this.stackedCubes = stackedCubes;
    }
}
