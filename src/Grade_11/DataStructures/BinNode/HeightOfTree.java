package Grade_11.DataStructures.BinNode;

public class HeightOfTree {
    public static int height(BinNode<Integer> t) {
        if (!t.hasLeft() && !t.hasRight()) {
            return 0;
        }
        if (t.hasLeft() && !t.hasRight()) {
            return height(t.getLeft()) + 1;
        }
        if (t.hasRight() && !t.hasLeft()) {
            return height(t.getRight()) + 1;
        }
        return Math.max(height(t.getLeft()), height(t.getRight())) + 1;
    }

    public static int heightClassSolution(BinNode<Integer> t) {
        if (t == null) {
            return -1;
        }
        return Math.max(heightClassSolution(t.getLeft()), heightClassSolution(t.getRight())) + 1;
    }
}
