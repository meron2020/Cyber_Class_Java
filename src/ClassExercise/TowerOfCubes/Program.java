package ClassExercise.TowerOfCubes;

import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);

    public static boolean getUserAction(CubesTower cubesTower) {
        boolean toReturn = true;
        System.out.println("Enter -1 if you would like to add a block to the tower, -2 if you like to remove a block " +
                "from the tower, or 0 if you like to end the game.");
        int input = scanner.nextInt();
        if (input == 0) {
            toReturn = false;
        } else if (input == -2) {
            toReturn = cubesTower.userRemoveCube();
        } else if (input == -1) {
            toReturn = cubesTower.userAddCube();
        } else {
            System.out.println("Your input was incorrect, please try again later");
            toReturn = false;
        }
        System.out.println(cubesTower);
        return toReturn;
    }

    public static CubesTower createColorCubesTower(CubesTower cubesTower) {
        return CubesTower.createDiverseColorTower(cubesTower);
    }

    public static void main(String[] args) {
        System.out.println("Enter maximum amount of cubes in your tower >>");
        int maxCubes = scanner.nextInt();
        CubesTower cubesTower = new CubesTower(maxCubes);
        boolean canContinue = true;
        while (canContinue) {
            canContinue = getUserAction(cubesTower);
        }

        System.out.println(createColorCubesTower(cubesTower));
        System.out.println(CubesTower.createDiverseColorTower(cubesTower));
    }
}
