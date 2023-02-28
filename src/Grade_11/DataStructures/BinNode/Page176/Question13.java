package Grade_11.DataStructures.BinNode.Page176;

import Grade_11.DataStructures.BinNode.BinNode;

public class Question13 {
    public static void checkClosestSon(BinNode<Integer> node) {
        if (node.hasLeft()) {
            checkClosestSon(node.getLeft());
        }
        if (node.hasRight()) {
            checkClosestSon(node.getRight());
        }
        if (node.hasLeft() && node.hasRight()) {
            if (Math.abs(node.getValue() - node.getLeft().getValue()) > Math.abs(node.getValue() - node.getRight().getValue())) {
                System.out.println(node.getRight().getValue());
            } else {
                System.out.println(node.getLeft().getValue());
            }
        }
        if (node.hasRight()) {
            System.out.println(node.getRight().getValue());
        } else {
            System.out.println(node.getLeft().getValue());
        }
    }
}
