package Grade_11.Recursion.BookQuestions.P28;

public class Question25 {
    public static void dividedBy(int num) {
        dividedBy(num, num/2, 1);
    }

    public static void dividedBy(int num, int limit, int i) {
        if (i <= limit) {
            if (num % i == 0) {
                System.out.println(i);
            }
            dividedBy(num, limit, i+1);
        }
    }

    public static void main(String[] args) {
        dividedBy(12);
    }
}
