package Grade_11.DataStructures.BinNode.Page176;

import Grade_11.DataStructures.BinNode.BinNode;

public class Question11 {
    public static void printAllEven(BinNode<Integer> t) {
        if (t != null) {
           printAllEven(t.getLeft());
           printAllEven(t.getRight());
        }
        if (t.getValue() % 2 == 0) {
            if (!t.hasRight() && !t.hasLeft()) {
                System.out.println(t.getValue());
            }
            else if (!(t.getRight().getValue() % 2 == 1 || t.getLeft().getValue() % 2 == 1)) {
                System.out.println(t.getValue());
            }
        }
    }
}
