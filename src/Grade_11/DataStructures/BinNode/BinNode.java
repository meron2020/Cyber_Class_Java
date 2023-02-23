package Grade_11.DataStructures.BinNode;

public class BinNode<T> {
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BinNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinNode<T> left) {
        this.left = left;
    }

    public BinNode<T> getRight() {
        return right;
    }

    public void setRight(BinNode<T> right) {
        this.right = right;
    }

    public boolean hasLeft() {
        return this.getLeft() != null;
    }

    public boolean hasRight() {
        return this.getRight() != null;
    }

    private T value;
    private BinNode<T> left;
    private BinNode<T> right;

    public static void updateCharacter(BinNode<Character> t) {
        if (t != null) {
            char ch = t.getValue();
            if (ch == 'z') {
                ch = 'a';
            } else {
                ch++;
            }
            t.setValue(ch);
            updateCharacter(t.getLeft());
            updateCharacter(t.getRight());
        }
    }

    public static void updateInteger(BinNode<Integer> t) {
        if (t != null && !isLeafInteger(t)) {
            if (t != null) {
                updateInteger(t.getLeft());
                updateInteger(t.getRight());
            }
            int s = 0;
            if (t.hasLeft()) {
                s += t.getLeft().getValue();
            }
            if (t.hasRight()) {
                s += t.getRight().getValue();
            }
            t.setValue(s);
        }
    }


    public static boolean isLeafInteger(BinNode<Integer> t) {
        if (t == null) {
            return false;
        }
        return !t.hasLeft() && !t.hasRight();
    }

    public static boolean isLeafCharacter(BinNode<Integer> t) {
        if (t == null) {
            return false;
        }
        return !t.hasLeft() && !t.hasRight();
    }


    public static void printLeaves(BinNode<Integer> t) {
        if (t != null) {
            if (isLeafInteger(t)) {
                System.out.println(t.getValue());
            } else {
                printLeaves(t.getLeft());
                printLeaves(t.getRight());
            }
        }
    }

    public static int countNodes(BinNode<Integer> t) {
        if (t == null) {
            return 0;
        }
        return countNodes(t.getLeft()) + countNodes(t.getRight()) + 1;
    }

    public static int sumSingle(BinNode<Integer> t) {
        if (t == null || isLeafInteger(t)) {
            return 0;
        }
        if (t.hasLeft() && !t.hasRight()) {
            return sumSingle(t.getLeft()) + t.getLeft().getValue();
        }
        if (t.hasRight() && !t.hasLeft()) {
            return sumSingle(t.getRight()) + t.getRight().getValue();
        }

        return sumSingle(t.getRight()) + sumSingle(t.getRight());
    }
}
