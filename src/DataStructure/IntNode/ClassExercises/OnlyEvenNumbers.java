package DataStructure.IntNode.ClassExercises;

import DataStructure.IntNode.IntNode;

public class OnlyEvenNumbers {
    public static IntNode onlyEvenNumbers(IntNode l1) {
        IntNode l2 = new IntNode(0);
        IntNode last = l2;
        IntNode p = l1;
        while (p.getNext() != null) {
            if (p.getValue() % 2 == 0) {
                l2.setNext(new IntNode(p.getValue()));
                last = last.getNext();
            }
            p = p.getNext();
        }

        return l2.getNext();
    }
}
