package Grade_11.DataStructures.BinNode.Page176;

import Grade_11.DataStructures.BinNode.BinNode;

public class Question16 {
    public static int numWithTwoSons(BinNode<Integer> node) {
        if (node != null) {
            if (node.hasLeft() && node.hasRight()) {
                return 1 + numWithTwoSons(node.getLeft()) + numWithTwoSons(node.getRight());
            }
            if (node.hasLeft()) {
                return numWithTwoSons(node.getLeft());
            }
            if (node.hasRight()) {
                return numWithTwoSons(node.getRight());
            }
        }

        return 0;
    }
}
