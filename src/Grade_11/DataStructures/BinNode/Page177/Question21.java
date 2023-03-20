package Grade_11.DataStructures.BinNode.Page177;

import Grade_11.DataStructures.BinNode.BinNode;

public class Question21 {
    public static boolean symmetric(BinNode<Integer> t) {
        return BinNode.height(t.getLeft()) - BinNode.height(t.getRight()) <= 1
                && BinNode.height(t.getLeft()) - BinNode.height(t.getRight()) >= -1;
    }
}
