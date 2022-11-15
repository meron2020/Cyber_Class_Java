package Grade_11.DataStructures.Node.BookQuestions.Page_99.Q48;

import Grade_11.DataStructures.Node.Node;

public class Q48 {
    public static Integer checkRocks(Node<DominoRock> rocks, DominoRock rockToCheck) {
        int counter = 0;
        Node<DominoRock> p = rocks;
        while (p != null) {
            if (p.getValue().checkIfNumExists(rockToCheck.getFirstNum()) ||
                    p.getValue().checkIfNumExists(rockToCheck.getSecondNum())) {
                counter++;
            }
            p = p.getNext();
        }
        return counter;

    }
}
