package Grade_11.DataStructures.BinNode;

public class FatherEqualToSon {
    public static boolean fatherEqualToSon(BinNode<Integer> node) {
        if (node != null) {
            if (node.getValue() == node.getLeft().getValue() || node.getValue() == node.getRight().getValue()) {
                return true;
            }
            else {
                return fatherEqualToSon(node.getLeft()) || fatherEqualToSon(node.getRight());
            }
        }
        return false;
    }
}
