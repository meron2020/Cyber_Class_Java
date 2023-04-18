package Grade_11.StudiesForTests;

public class Question1Matkonet {
    public static boolean exist(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static int[] addOpposites(int[] arr) {
        int[] opposites = new int[arr.length];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!exist(arr, -arr[i])) {
                opposites[counter] = -arr[i];
                counter++;
            }
        }
        int[] newArr = new int[arr.length + counter];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < counter; i++) {
            newArr[arr.length + i] = newArr[i];
        }

        return opposites;
    }

    public static void main(String[] args) {
        int[] arr = {1, 35, 15, -13, 54};
        int[] opposites = addOpposites(arr);
        for (int i = 0; i < opposites.length; i++) {
            System.out.println(opposites[i]);
        }
    }
}
