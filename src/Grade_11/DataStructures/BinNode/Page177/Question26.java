package Grade_11.DataStructures.BinNode.Page177;

import Grade_11.DataStructures.BinNode.BinNode;

public class Question26 {
    public static int numOfLeaves(BinNode<Integer> t) {
        if (t == null) {
            return 0;
        }
        if (BinNode.isLeafInteger(t)) {
            return 1;
        }
        return numOfLeaves(t.getLeft()) + numOfLeaves(t.getRight());
    }

    public static boolean fullTree(BinNode<Integer> t) {
        int height = BinNode.height(t);
        return numOfLeaves(t) == Math.pow(2, height);
    }
}
