package Grade_11.DataStructures.BinNode.Page177;

import Grade_11.DataStructures.BinNode.BinNode;

public class Question20 {
    public static boolean followingTree(BinNode<Integer> t, int n) {
        for (int i = 0; i < n; i++) {
            boolean exists = BinNode.exist(t, i + 1);
            if (!exists) return false;
        }
        return true;

    }
}
