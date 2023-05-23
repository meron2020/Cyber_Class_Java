package Grade_11.StudiesForBagrut.Bagrut2018.Question6;

import Grade_11.DataStructures.BinNode.BinNode;

// O(n**2)
public class Question6 {
    public static boolean lessThanTree(int x, BinNode<Integer> t) {
        return true;
    }
    public static boolean treeLessThanTree(BinNode<Integer> t1, BinNode<Integer> t2) {
        if (t1 != null) {
            if (lessThanTree(t1.getValue(), t2)) {
                return treeLessThanTree(t1.getLeft(), t2) && treeLessThanTree(t1.getRight(), t2);
            }
            return false;

        }
        return true;
    }
}
