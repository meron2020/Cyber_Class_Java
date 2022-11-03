package DataStructures.IntNode.ClassExercises;

import DataStructures.IntNode.IntNode;

public class DeleteNBiggestNumbers {

    public static void deleteNumberFromList(IntNode list, int num) {

    }

    public static void deleteNBiggestNumbers(IntNode list, int n) {
        IntNode p = new IntNode(0, list);
        int largestNum = p.getNext().getValue();
        while (p.getNext() != null) {
            if (p.getNext().getValue() > largestNum) {
                largestNum = p.getNext().getValue();
            }
            p = p.getNext();
        }

    }
}
