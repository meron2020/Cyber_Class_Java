package Grade_11.DataStructures.BinNode;

public class SameStructure {
    // Function that takes two trees as parameters and returns true if the trees have same structure
    public static boolean sameStructure(BinNode<Integer> t1, BinNode<Integer> t2) {
        if ((t1 == null && t2 == null) || (BinNode.isLeafInteger(t1) && BinNode.isLeafInteger(t2))) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        return sameStructure(t1.getLeft(), t2.getLeft()) && sameStructure(t1.getRight(), t2.getRight());
    }
}
