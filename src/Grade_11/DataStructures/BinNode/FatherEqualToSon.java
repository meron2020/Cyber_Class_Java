package Grade_11.DataStructures.BinNode;

public class FatherEqualToSon {
    public static boolean fatherEqualToSon(BinNode<Integer> node) {
        if (node != null || BinNode.isLeafInteger(node)) {
            if (node.getValue() == node.getLeft().getValue() || node.getValue() == node.getRight().getValue()) {
                return true;
            } else {
                return fatherEqualToSon(node.getLeft()) || fatherEqualToSon(node.getRight());
            }
        }
        return false;
    }


    // Class Solution
    public static boolean likeFatherLikeSon(BinNode<Integer> t) {
        if (t == null || BinNode.isLeafInteger(t)) {
            return false;
        }
        if (t.hasLeft() && t.getValue() == t.getLeft().getValue()) {
            return true;
        }
        if (t.hasRight() && t.getValue() == t.getRight().getValue()) {
            return true;
        }
        return likeFatherLikeSon(t.getLeft()) || likeFatherLikeSon(t.getRight());
    }
}
