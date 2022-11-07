package DataStructures.IntNode.HW.Page_76;

import DataStructures.IntNode.IntNode;
//Page 76 Question 9
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
