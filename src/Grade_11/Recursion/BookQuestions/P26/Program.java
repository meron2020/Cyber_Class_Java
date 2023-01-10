package Grade_11.Recursion.BookQuestions.P26;

public class Program {
    public static int add(int n) {
        if (n == 1) {
            return 1;
        }

        return add(n - 1) + n;
    }

    public static int addOddNumbers(int n) {
        if (n == 1) {
            return 1;
        }

        if (n % 2 == 1) {
            return addOddNumbers(n - 1) + n;
        } else {
            return addOddNumbers(n - 1);
        }
    }

    public static int digits(int n) {
        if (n == 0) {
            return 0;
        }
        return digits(n / 10) + 1;
    }

    public static boolean multiple(int x, int y) {
        if (x - y == 0) {
            return true;
        }
        if (x > y) {
            return false;
        }
        return multiple(x, y - x);
    }

    public static boolean primary(int num, int y) {
        if (y == 1) {
            return true;
        }
        if (num % y == 0) {
            return false;
        }
        return primary(num, y - 1);
    }

    public static boolean allEvenOrOddDigits(int num) {
        if (num < 10) {
            return true;
        }
        if (num % 2 != num / 10 % 2) {
            return false;
        }


        return allEvenOrOddDigits(num / 10);
    }

    public static int sumOfSquaresAndMultiples(int y) {
        if (y == 1) {
            return 2;
        }
        if (y % 2 == 0) {
            return y * y + sumOfSquaresAndMultiples(y - 1);
        }
        return 2 * y + sumOfSquaresAndMultiples(y - 1);

    }


    public static void main(String[] args) {
        System.out.println(allEvenOrOddDigits(75971));
        System.out.println(sumOfSquaresAndMultiples(5));
    }
}
