package Grade_11.DataStructures.BinNode;

import java.util.Scanner;

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

    public BinNode(BinNode<T> left, T value, BinNode<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

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

    public static boolean isLeafString(BinNode<String> t) {
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

    public static boolean exist(BinNode<Integer> t, int x) {
        if (t == null) {
            return false;
        }
        if (t.getLeft().getValue() == x) {
            return true;
        }
        return exist(t.getLeft(), x) || exist(t.getRight(), x);
    }

    public static boolean existCharacter(BinNode<Character> t, char x) {
        if (t == null) {
            return false;
        }
        if (t.getLeft().getValue() == x) {
            return true;
        }
        return existCharacter(t.getLeft(), x) || existCharacter(t.getRight(), x);
    }

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

    public static int height(BinNode<Integer> t) {
        if (t == null) {
            return -1;
        }
        return Math.max(height(t.getLeft()), height(t.getRight())) + 1;
    }

    public static BinNode<Integer> createBinNode() {
        System.out.println("Enter integer root value (Enter -1 for end):");
        return readIntegerTree();
    }

    public static BinNode<Integer> readIntegerTree() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value == -1) {
            return null;
        }
        System.out.println("Enter left of " + value + " (or enter -1 to null)");
        BinNode<Integer> left = readIntegerTree();
        System.out.println("Enter right of " + value + " (or enter -1 to null)");
        BinNode<Integer> right = readIntegerTree();
        return new BinNode<Integer>(left, value, right);
    }
}
