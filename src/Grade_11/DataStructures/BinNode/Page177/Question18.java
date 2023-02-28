package Grade_11.DataStructures.BinNode.Page177;

import Grade_11.DataStructures.BinNode.BinNode;

public class Question18 {
    public static boolean contain(BinNode<Integer> t1, BinNode<Integer> t2) {
        if (t1 == null) {
            return true;
        }
        if (!BinNode.exist(t2, t1.getValue())) {
            return false;
        }
        return contain(t1.getLeft(), t2);
    }
}
