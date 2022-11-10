package Grade_11.DataStructures.IntNode.HW.Page_76;

import Grade_11.DataStructures.IntNode.IntNode;
//Page 76 Question 2
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
