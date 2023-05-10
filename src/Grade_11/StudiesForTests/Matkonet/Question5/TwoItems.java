package Grade_11.StudiesForTests.Matkonet.Question5;

import Grade_11.DataStructures.BinNode.BinNode;

public class TwoItems {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static boolean valueExists(BinNode<TwoItems> t, int x) {
        if (t == null) {
            return false;
        }
        if (t.getValue().getX() == x || t.getValue().getY() == x) {
            return true;
        }
        return valueExists(t.getLeft(), x) || valueExists(t.getRight(), x);
    }
    public static boolean checkIfValuesInTree(BinNode<TwoItems> tree) {
        if (tree.getLeft() != null && tree.getRight() != null) {
            return (valueExists(tree.getLeft(), tree.getValue().getX()) && valueExists(tree.getRight(), tree.getValue().getX())) ||
                    (valueExists(tree.getLeft(), tree.getValue().getY()) && valueExists(tree.getRight(), tree.getValue().getY()));
        }
        if (tree.getLeft() != null) {
            return valueExists(tree.getLeft(), tree.getValue().getX()) || valueExists(tree.getLeft(), tree.getValue().getY());
        }
        if (tree.getRight() != null) {
            return valueExists(tree.getRight(), tree.getValue().getX()) || valueExists(tree.getRight(), tree.getValue().getY());
        }
        return true;
    }

    public static boolean bothValuesInSubTree(BinNode<TwoItems> T) {
        if (T != null) {
            return bothValuesInSubTree(T.getLeft()) && bothValuesInSubTree(T.getRight()) && checkIfValuesInTree(T);
        }
        return true;
    }
}
