package Grade_11.Recursion.BookQuestions.P28;

public class Question30 {
    public static void series(int n, int num, int i) {
        if (i < n) {
            if (i % 2 == 0) {
                System.out.println(num);
                series(n, num - 1, i + 1);
            } else {
                System.out.println(num);
                series(n, num + 2, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        series(5, 4, 0);
    }
}
