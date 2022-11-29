package Grade_11.DataStructures.Node.BookQuestions.Page_99.Q48;

import Grade_11.DataStructures.NodeClass;

public class Q48 {
    public static Integer checkRocks(NodeClass<DominoRock> rocks, DominoRock rockToCheck) {
        int counter = 0;
        NodeClass<DominoRock> p = rocks;
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
