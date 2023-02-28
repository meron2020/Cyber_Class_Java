package Grade_11.DataStructures.BinNode;

public class NoSingle {
    public static boolean noSingle(BinNode<Integer> t) {
        if (t == null || BinNode.isLeafInteger(t)) {
            return true;
        }
        if (t.hasRight() != t.hasLeft()) {
            return false;
        }
        return noSingle(t.getLeft()) && noSingle(t.getRight());
    }
}
