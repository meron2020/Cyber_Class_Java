package Grade_11.DataStructures.BinNode.Page176;

import Grade_11.DataStructures.BinNode.BinNode;

public class Question15 {
    public static int howManyBetweenHighLow(BinNode<Integer> node, int low, int high) {
        if (node != null) {
            if (!(node.hasLeft() || node.hasRight())) {
                if (node.getValue() < high && node.getValue() > low) {
                    return 1;
                }
            }
            if (node.hasLeft()) {
                if (node.getValue() < high && node.getValue() > low) {
                    return 1 + howManyBetweenHighLow(node.getLeft(), low, high);
                }
                return howManyBetweenHighLow(node.getLeft(), low, high);
            }
            else {
                if (node.getValue() < high && node.getValue() > low) {
                    return 1 + howManyBetweenHighLow(node.getRight(), low, high);
                }
                return howManyBetweenHighLow(node.getRight(), low, high);
            }

        }
        return 0;
    }
}
