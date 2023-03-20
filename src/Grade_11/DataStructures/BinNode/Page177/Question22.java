package Grade_11.DataStructures.BinNode.Page177;

import Grade_11.DataStructures.BinNode.BinNode;

public class Question22 {
    public static boolean balancedBoys(BinNode<Integer> t) {
        if (BinNode.isLeafInteger(t)) {
            return true;
        }
        if (t.hasLeft() && t.hasRight()) {
            return balancedBoys(t.getLeft()) && balancedBoys(t.getRight());
        }
        return false;
    }
}
