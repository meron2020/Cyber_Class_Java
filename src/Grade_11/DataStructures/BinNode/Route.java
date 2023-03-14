package Grade_11.DataStructures.BinNode;

public class Route {
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

    public static boolean routeExistsClassSolution(BinNode<Integer> t) {
        if (t == null || BinNode.isLeafInteger(t)) {
            return true;
        }
        boolean flagL = false;
        boolean flagR = false;
        if (t.hasLeft() && t.getValue() == t.getLeft().getValue()) {
            flagL = routeExistsClassSolution(t.getLeft());
        }
        if (t.hasRight() && t.getValue() == t.getRight().getValue()) {
            flagR = routeExistsClassSolution(t.getRight());
        }
        return flagL || flagR;
    }

    public static boolean secondSolution(BinNode<Integer> t) {
        if (t == null || BinNode.isLeafInteger(t)) {
            return true;
        }
        int num = t.getValue();
        if (t.hasLeft() && t.hasRight()) {
            if (t.getLeft().getValue() == num) {
                return secondSolution(t.getLeft()) || secondSolution(t.getRight());
            }
        }
        if (t.hasLeft() && t.getLeft().getValue() == num) {
            return secondSolution(t.getLeft());
        }
        if (t.hasRight() && t.getRight().getValue() == num) {
            return secondSolution(t.getRight());
        }
        else {
            return false;
        }

    }
}
