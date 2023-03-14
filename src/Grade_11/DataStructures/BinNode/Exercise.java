package Grade_11.DataStructures.BinNode;

public class Exercise {
    // Function that takes a tree as a parameter and checks if there is a route from the root of the tree to one of the
    // leaves in which all the values are equal.
    public static boolean routeExists(BinNode<Integer> t) {
        if (t == null || BinNode.isLeafInteger(t)) {
            return true;
        }
        if (t.getValue() != t.getRight().getValue() && t.getValue() != t.getLeft().getValue()) {
            return false;
        } else {
            return routeExists(t.getLeft()) || routeExists(t.getRight());
        }
    }
}
