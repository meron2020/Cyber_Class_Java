package Grade_11.DataStructures.BinNode.Page176;

import Grade_11.DataStructures.BinNode.BinNode;

public class Question8 {
    public static void printAllNegative(BinNode<Integer> tree) {
        if (tree != null) {
            printAllNegative(tree.getLeft());
            printAllNegative(tree.getRight());
            if (tree.getValue() < 0) {
                System.out.println(tree.getValue());
            }
        }
    }

    public static void printAllLeft(BinNode<Integer> tree) {
        if (tree.getLeft() != null) {
            System.out.println(tree.getLeft());
            printAllNegative(tree.getLeft());
            printAllNegative(tree.getRight());
        }
    }
}
