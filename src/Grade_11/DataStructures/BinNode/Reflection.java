package Grade_11.DataStructures.BinNode;

public class Reflection {
    // Function returns true if the trees are a reflection of one another.
    public static boolean isReflection(BinNode<Integer> t1, BinNode<Integer> t2) {

        if ((t1 == null && t2 == null) || (BinNode.isLeafInteger(t1) && BinNode.isLeafInteger(t2))) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        return isReflection(t1.getLeft(), t2.getRight()) && isReflection(t1.getRight(), t2.getLeft());

    }
}
