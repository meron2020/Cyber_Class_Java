package Grade_10.ObjectOriented.UnassignedExercises;

import java.util.Random;

public class Rational {
    int numerator;
    int denomenator;

    public Rational(int x, int y) {
        numerator = x;
        if (y != 0) {
            denomenator = y;
        }
    }


    public Rational(Rational num) {
        this.numerator = num.getNumerator();
        this.denomenator = num.getDenom();
    }

    public static int findGCD(int numerator, int denomenator) {
        while (numerator != denomenator) {

            if (numerator > denomenator) {
                numerator -= denomenator;
            } else {
                denomenator -= numerator;
            }
        }

        return numerator;
    }

    public static Rational reduction(Rational num) {
        int gcd = findGCD(num.getNumerator(), num.getDenom());
        return new Rational(num.getNumerator() / gcd, num.getDenom() / gcd);
    }

    public static void main(String[] args) {
        Rational num = new Rational(1, 2);
        System.out.println(num.getNumerator());
        System.out.println(num.getDenom());
        System.out.println(num.isEqual(new Rational(2, 4)));
        System.out.println(num.multiply(new Rational(3, 6)));
        System.out.println(num.divide(new Rational(3, 6)));
        System.out.println(num);

        Rational newNum = new Rational(1, 4);
        System.out.println(num.add(newNum));
        System.out.println(num.sub(newNum));
        System.out.println(num.compareTo(newNum));

        Rational[] rationalArray = new Rational[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            rationalArray[i] = new Rational(random.nextInt(10), random.nextInt(20));
        }

    }

    public Rational sumOfArray(Rational[] rationalArray) {
        Rational rationalSum = rationalArray[0];
        for (int i = 1; i < 10; i++) {
            rationalSum = rationalSum.add(rationalArray[i]);
        }
        return rationalSum;
    }

    public Rational smallestRationalNum(Rational[] rationalArray) {
        Rational smallestNum = rationalArray[0];
        for (int i = 1; i < 10; i++) {
            if (smallestNum.compareTo(rationalArray[i]) == 2) {
                smallestNum = rationalArray[i];
            }
        }

        return smallestNum;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenom() {
        return denomenator;
    }

    public boolean isEqual(Rational num) {
        return this.getNumerator() * num.getDenom() == this.getDenom() * num.getDenom();
    }

    public Rational multiply(Rational num) {
        return new Rational(this.getNumerator() * num.getNumerator(), this.getDenom() * num.getDenom());
    }

    public Rational divide(Rational num) {
        return new Rational(this.getNumerator() * num.getDenom(), this.getDenom() * num.getNumerator());
    }

    public String toString() {
        return String.format("%s / %s", this.getNumerator(), this.getDenom());
    }

    public int findLCM(Rational numOne, Rational numTwo) {
        int absHigherNumber = Math.max(numOne.denomenator, numTwo.denomenator);
        int absLowerNumber = Math.min(numOne.denomenator, numTwo.denomenator);
        int lcm = absHigherNumber;
        while (lcm % absLowerNumber != 0) {
            lcm += absHigherNumber;
        }
        return lcm;
    }

    public Rational add(Rational other) {
        int lcm = findLCM(this, other);
        Rational newRationalOne = this.multiply(new Rational(this.numerator * (lcm / denomenator), (lcm / denomenator)));
        Rational newRationalTwo = other.multiply(new Rational(other.numerator * (lcm / other.denomenator), (lcm / other.denomenator)));
        Rational rationalToReduce = new Rational(newRationalTwo.getNumerator() + newRationalOne.getNumerator(), newRationalOne.denomenator);
        return reduction(rationalToReduce);
    }

    public Rational sub(Rational other) {
        int lcm = findLCM(this, other);
        Rational newRationalOne = this.multiply(new Rational(this.numerator * (lcm / denomenator), (lcm / denomenator)));
        Rational newRationalTwo = other.multiply(new Rational(other.numerator * (lcm / other.denomenator), (lcm / other.denomenator)));
        Rational rationalToReduce = new Rational(newRationalTwo.getNumerator() - newRationalOne.getNumerator(), newRationalOne.denomenator);
        return reduction(rationalToReduce);
    }

    public int compareTo(Rational other) {
        if (this.numerator / this.denomenator == other.numerator / other.denomenator) {
            return 0;
        }

        if (this.numerator / this.denomenator > other.numerator / other.denomenator) {
            return 2;
        }
        return 1;
    }


}
