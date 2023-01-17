package Grade_11.Recursion.BookQuestions.P26;

public class Question12 {
    public static int question12(int n1, int n2, int n3) {
        if (n3 >= n2) {
            return 0;
        }
        return n3 + question12(n1, n2, n3 + n1);
    }

    public static int question12(int n1, int n2) {
        return question12(n1, n2, n1);
    }

    public static void main(String[] args) {
        System.out.println(question12(3, 9));
    }
}
