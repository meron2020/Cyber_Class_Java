package Grade_11.Recursion.ClassExercises;

public class MultiplicationTable {
    public static void kefel() {
        kefel(1,1);
    }
    public static void kefel(int i,  int j) {
        if (i < 11) {
            if (j < 11) {
                System.out.print(i * j + " ");
                kefel(i, j + 1);
            }
            else {
                System.out.println();
                kefel(i+1, 1);
            }
        }
    }

    public static void main(String[] args) {
        kefel();
    }
}
