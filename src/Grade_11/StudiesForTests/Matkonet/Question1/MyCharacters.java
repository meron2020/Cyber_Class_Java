package Grade_11.StudiesForTests.Matkonet.Question1;

public class MyCharacters {
    char[] arr;
    char ch;

    public MyCharacters(char[] arr, char ch) {
        this.arr = arr;
        this.ch = ch;
    }

    public String differentCharacters() {
        String stringToReturn = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ch) {
                stringToReturn += arr[i];
            }
        }
        return stringToReturn;
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'g', 'a', 'o', 'o', 'a', 'd', 'a'};
        MyCharacters myCharacters = new MyCharacters(arr, 'a');
        System.out.println(myCharacters.differentCharacters());
    }
}
