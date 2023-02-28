package Grade_11.DataStructures.BinNode.Page176;

import Grade_11.DataStructures.BinNode.BinNode;

public class Question11 {
    // My solution
    public static void printAllEven(BinNode<Integer> t) {
        if (t != null) {
            if (t.getValue() % 2 == 0) {
                if (!t.hasRight() && !t.hasLeft()) {
                    System.out.println(t.getValue());
                } else if (!(t.getRight().getValue() % 2 == 1 || t.getLeft().getValue() % 2 == 1)) {
                    System.out.println(t.getValue());
                }
            }
            printAllEven(t.getLeft());
            printAllEven(t.getRight());
        }

    }

    public static void printEven(BinNode<Integer> t) {
        if (t != null) {
            if (t.getValue() % 2 == 0) {
                boolean ok = true;
                if (t.hasLeft() && t.getLeft().getValue() % 2 == 0) {
                    ok = false;
                }
                if (t.hasRight() && t.getRight().getValue() % 2 == 0) {
                    ok = false;
                }
                if (ok) {
                    System.out.println(t.getValue());
                }
                printEven(t.getLeft());
                printEven(t.getRight());
            }
        }
    }
}
