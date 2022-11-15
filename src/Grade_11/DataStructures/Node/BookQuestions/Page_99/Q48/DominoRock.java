package Grade_11.DataStructures.Node.BookQuestions.Page_99.Q48;

public class DominoRock {
    private int firstNum;
    private int secondNum;

    public DominoRock(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public boolean checkIfNumExists(int num) {
        return firstNum == num || secondNum == num;
    }
}
