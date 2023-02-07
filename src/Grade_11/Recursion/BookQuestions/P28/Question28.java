package Grade_11.Recursion.BookQuestions.P28;

public class Question28 {
    public static void mathematicalSeries(int a1, int d, int n) {
        System.out.println(a1);
        if (n > 1) {
            mathematicalSeries(a1+d, d, n-1);
        }
    }

    public static void main(String[] args) {
        mathematicalSeries(1,3,5);
    }


}