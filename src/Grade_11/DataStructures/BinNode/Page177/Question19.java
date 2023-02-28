package Grade_11.DataStructures.BinNode.Page177;

import Grade_11.DataStructures.BinNode.BinNode;

public class Question19 {
    public static int biggestDifference(BinNode<Integer> t) {
        if (BinNode.isLeafInteger(t)) {
            return t.getValue();
        }
        if (t.hasLeft() && !t.hasRight()) {
            return biggestDifference(t.getLeft()) + t.getValue();
        }
        if (t.hasRight() && !t.hasLeft()) {
            return biggestDifference(t.getRight()) + t.getValue();
        }
        return t.getValue() + biggestDifference(t.getLeft()) + biggestDifference(t.getRight());
    }
}
