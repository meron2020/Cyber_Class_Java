package ClassExercise.UnassignedExercises;

public class DiceThrowingGame {
    int value;

    public DiceThrowingGame() {
        this.roll();
    }

    public void roll() {
        this.value = (int) (Math.random() * 6);
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        int counter = 0;
        DiceThrowingGame dice1 = new DiceThrowingGame();
        DiceThrowingGame dice2 = new DiceThrowingGame();

        while (counter < 5) {
            int d1val = dice1.getValue();
            int d2val = dice2.getValue();


            if (d1val == d2val) {
                counter++;
                System.out.println(d1val);
                System.out.println(d2val);
            }

            else {
                counter = 0;
            }

            dice1.roll();
            dice2.roll();
        }
    }
}
