package Grade_11.DataStructures.BinNode.Page177;

import Grade_11.DataStructures.BinNode.BinNode;

public class Question23 {
    public static int findMax(BinNode<Integer> t) {
        if (BinNode.isLeafInteger(t)) {
            return t.getValue();
        }
        if (t.hasLeft() && !t.hasRight()) {
            return Math.max(findMax(t.getLeft()), t.getValue());
        }
        if (t.hasRight() && !t.hasLeft()) {
            return Math.max(findMax(t.getRight()), t.getValue());
        }
        return Math.max(Math.max(findMax(t.getLeft()), findMax(t.getRight())), t.getValue());
    }

    public static int findMin(BinNode<Integer> t) {
        if (BinNode.isLeafInteger(t)) {
            return t.getValue();
        }
        if (t.hasLeft() && !t.hasRight()) {
            return Math.min(findMax(t.getLeft()), t.getValue());
        }
        if (t.hasRight() && !t.hasLeft()) {
            return Math.min(findMax(t.getRight()), t.getValue());
        }
        return Math.min(Math.max(findMax(t.getLeft()), findMax(t.getRight())), t.getValue());
    }
}
