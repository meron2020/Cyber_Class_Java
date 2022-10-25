package DataStructure.IntNode.HW;

import DataStructure.IntNode.IntNode;

public class AmountOfSequences {
    public static int sequenceAmount(IntNode firstInList, int number) {
        int counter = 0;
        IntNode p = firstInList;
        while (p.getNext() != null) {
            if (p.getNext().getValue() != p.getValue()) {
                counter++;
            }
        }
        return counter;
    }
}
