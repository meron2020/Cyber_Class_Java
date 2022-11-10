package Grade_11.DataStructures.IntNode.HW.Page_76;

import Grade_11.DataStructures.IntNode.IntNode;
//Page 76 Question 12
public class StableList {
    public static boolean isStable(IntNode firstInList) {
        int amountOfNodes = 1;
        int total = firstInList.getValue();
        IntNode p = firstInList.getNext();
        while (p != null) {
            amountOfNodes++;
            total += p.getValue();
            p = p.getNext();
        }

        double average = (double) total / amountOfNodes;

        int aboveAverageCount = 0;
        int belowAverageCount = 0;

        while (p != null) {
            if (p.getValue() > average) {
                aboveAverageCount++;
            } else {
                belowAverageCount++;
            }

            p = p.getNext();
        }

        return aboveAverageCount == belowAverageCount;
    }
}
