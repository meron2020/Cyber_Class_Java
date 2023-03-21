package Grade_11.DataStructures.BinNode.Page180;

import Grade_11.DataStructures.BinNode.BinNode;

public class Question33 {
    public static void preOrderInt(BinNode<Integer> t) {
        System.out.println(t.getValue() + ",");
        preOrderInt(t.getLeft());
        preOrderInt(t.getRight());
    }

    public static void update(BinNode<Integer> t) {
        if (t != null) {
            if (t.getLeft() != null && t.getRight() != null) {
                if (t.getValue() == t.getLeft().getValue()) {
                    if (BinNode.isLeafInteger(t.getLeft())) {
                        t.setValue(t.getValue() + 1);
                    } else {
                        t.getLeft().setValue(t.getValue() + 1);
                    }
                }
                if (t.getValue() == t.getRight().getValue()) {
                    if (BinNode.isLeafInteger(t.getRight())) {
                        t.setValue(t.getValue() + 1);
                    } else {
                        t.getRight().setValue(t.getValue() + 1);
                    }
                }
                update(t.getLeft());
                update(t.getRight());
            } else if (t.getLeft() != null) {
                if (t.getValue() == t.getLeft().getValue()) {
                    if (BinNode.isLeafInteger(t.getLeft())) {
                        t.setValue(t.getValue() + 1);
                    } else {
                        t.getLeft().setValue(t.getValue() + 1);
                    }
                }
                update(t.getLeft());
            }
            else if (t.getRight() != null) {
                if (t.getValue() == t.getRight().getValue()) {
                    if (BinNode.isLeafInteger(t.getRight())) {
                        t.setValue(t.getValue() + 1);
                    } else {
                        t.getRight().setValue(t.getValue() + 1);
                    }
                }
                update(t.getRight());
            }
        }
    }
}
