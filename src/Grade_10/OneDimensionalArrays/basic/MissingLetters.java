package Grade_10.OneDimensionalArrays.basic;

public class MissingLetters {
    char[] alphabet = new char[52];
    char[] array = new char[13];

    MissingLetters() {
        this.fillArrays();
    }

    public void fillArrays() {
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) (65+i);
            alphabet[alphabet.length-(i+1)] = (char) (97+i);
        }
        for (int i = 0; i < 13; i++) {
            array[i] = alphabet[(int) (Math.random() * alphabet.length)];
        }
    }

    public boolean checkIfCharInArray(char character) {
        for (int element: array) {
            if (element == character) {
                return true;
            }
        }
        return false;
    }

    public void checkAllLetters() {
        System.out.println(this.array);
        for (char element: alphabet) {
            if (!this.checkIfCharInArray(element)) {
                System.out.print(element + " ");
            }
        }
    }

    public static void main(String[] args) {
        MissingLetters missingLetters = new MissingLetters();
        missingLetters.checkAllLetters();
    }
}
