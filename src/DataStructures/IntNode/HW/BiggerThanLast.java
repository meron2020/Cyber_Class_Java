package DataStructures.IntNode.HW;

import DataStructures.IntNode.IntNode;

public class BiggerThanLast {
    public static void biggerThanLast(IntNode firstInList) {
        IntNode p = firstInList;
        while (p.getNext() != null) {
            if (p.getValue() < p.getNext().getValue()) {
                System.out.println(p.getNext().getValue());
            }
        }
    }
}
