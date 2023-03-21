package Grade_11.DataStructures;

import Grade_11.DataStructures.BinNode.BinNode;

public class NumberTree {
    public static void printAll(BinNode<Integer> t) {
        if (t != null) {
            printAll(t, 0);
        }
    }
    public static void printAll(BinNode<Integer> t, int num) {
        if (t != null) {
            num = num * 10 + t.getValue();
            if (BinNode.isLeafInteger(t)) {
                System.out.println(num);
            } else {
                printAll(t.getLeft(), num);
                printAll(t.getRight(), num);
            }
        }
    }
}
