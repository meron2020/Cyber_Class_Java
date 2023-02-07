package Grade_11.Recursion.BookQuestions.P28;

public class Question26 {
    public static void evenDigits(int num) {
        if (num > 0) {
            int digit = (num % 10);
            if (digit % 2 == 0) {
                System.out.println(digit);
            }
            evenDigits(num / 10);
    } }

    public static void main(String[] args) {
        evenDigits(341232);
    }
}
