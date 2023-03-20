package Grade_11.DataStructures.BinNode.Page177;

import Grade_11.DataStructures.BinNode.BinNode;

public class Question24 {
    public static boolean hasOnlyChild(BinNode<Integer> t) {
        return (t.hasLeft() && !t.hasRight()) || (!t.hasLeft() && t.hasRight());
    }

    public static int numOfOnlyChildren(BinNode<Integer> t) {
        if (BinNode.isLeafInteger(t)) {
            return 0;
        }

        if (hasOnlyChild(t)) {
            if (t.hasLeft()) {
                return 1 + numOfOnlyChildren(t.getLeft());
            }
            if (t.hasRight()) {
                return 1 + numOfOnlyChildren(t.getRight());
            }

        }
        return numOfOnlyChildren(t.getLeft()) + numOfOnlyChildren(t.getRight());
    }

    public static int onlyChildrenWithOnlyChildren(BinNode<Integer> t) {
        if (BinNode.isLeafInteger(t)) {
            return 0;
        }
        if (t.hasLeft()) {
            if (hasOnlyChild(t.getLeft())) {
                return 1 + onlyChildrenWithOnlyChildren(t.getLeft());
            } else {
                return onlyChildrenWithOnlyChildren(t.getLeft());
            }
        }
        if (hasOnlyChild(t)) {
            if (t.hasRight()) {
                if (hasOnlyChild(t.getRight())) {
                    return 1 + onlyChildrenWithOnlyChildren(t.getRight());
                } else {
                    return onlyChildrenWithOnlyChildren(t.getRight());
                }
            }

        }

        return onlyChildrenWithOnlyChildren(t.getLeft()) + onlyChildrenWithOnlyChildren(t.getRight());
    }
}
