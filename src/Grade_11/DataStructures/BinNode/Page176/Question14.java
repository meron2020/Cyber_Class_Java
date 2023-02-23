package Grade_11.DataStructures.BinNode.Page176;

import Grade_11.DataStructures.BinNode.BinNode;

public class Question14 {
    public static int howManyLeaves(BinNode<Integer> node) {
        if (node.hasRight() && node.hasLeft()) {
            return howManyLeaves(node.getRight()) + howManyLeaves(node.getLeft());
        } else if (node.hasLeft()) {
            return howManyLeaves(node.getLeft());
        } else if (node.hasRight()) {
            return howManyLeaves(node.getRight());
        } else {
            return 1;
        }

    }
}
