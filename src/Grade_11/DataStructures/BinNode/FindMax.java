package Grade_11.DataStructures.BinNode;

public class FindMax {
    public static int findMax(BinNode<Integer> t) {
        if (BinNode.isLeafInteger(t)) {
            return t.getValue();
        }
        if (t.hasLeft() && !t.hasRight()) {
           return Math.max(findMax(t.getLeft()), t.getValue());
        }
        if (t.hasRight() && !t.hasLeft()) {
            return Math.max(findMax(t.getRight()), t.getValue());
        }
        return Math.max(Math.max(findMax(t.getLeft()), findMax(t.getRight())), t.getValue());
    }
}
