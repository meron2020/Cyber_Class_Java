package Grade_11.Recursion.BookQuestions.P28;

public class Question32 {
    public static void elementsSmallerThanNext(int[] array, int i) {
        if (i < array.length - 1) {
            if (array[i] < array[i + 1]) {
                System.out.println(array[i]);
            }
            elementsSmallerThanNext(array, i+1);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 15, 1, 14, 4112, 14};
        elementsSmallerThanNext(array, 0);
    }
}
