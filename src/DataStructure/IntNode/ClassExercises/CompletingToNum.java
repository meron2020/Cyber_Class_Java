package DataStructure.IntNode.ClassExercises;

import DataStructure.IntNode.IntNode;

public class CompletingToNum {
    public static void addNodeAfterGivenNode(IntNode nodeBefore, int nodeValue) {
        IntNode nodeToAdd = new IntNode(nodeValue, nodeBefore.getNext());
        nodeBefore.setNext(nodeToAdd);
    }

    public static void completingToNum(IntNode l1,  int num) {
        IntNode p = l1;
        while (p.getNext() != null) {
            int valueToAdd = num - p.getValue();
            addNodeAfterGivenNode(p, valueToAdd);
            p = p.getNext().getNext();
        }
    }
}
