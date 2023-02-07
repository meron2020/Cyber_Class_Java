package Grade_11.Recursion.BookQuestions.P28;

public class Question24 {

    public static void printCharsBetween(char one, char two) {
        one++;
        if (one < two) {
            System.out.println(one);
            printCharsBetween(one, two);
        }
    }

    public static void main(String[] args) {
        printCharsBetween('a', 'z');
    }
}
