package Grade_11.PassoverExercises.Question4;

import Grade_11.DataStructures.BinNode.BinNode;
import Grade_11.DataStructures.NodeClass;

public class UniqueNumsInEvenLevels {
    // Function returns height of tree.
    public static int height(BinNode<Integer> t) {
        if (t == null) {
            return -1;
        }
        return Math.max(height(t.getLeft()), height(t.getRight())) + 1;
    }

    // Uses a linked list to check if number on specific level is unique.
    public static void addUniqueNumbersFromLevel(BinNode<Integer> t, int level, NodeClass<Integer> list) {
        if (t != null) {
            if (level == 0) {
                NodeClass<Integer> p = list.getNext();
                boolean unique = true;
                while (p != null && unique) {
                    if (p.getValue() == t.getValue()) {
                        unique = false;
                    }
                    else {
                        p = p.getNext();
                    }
                }
                if (unique) {
                    list.setNext(new NodeClass<Integer>(t.getValue(), list.getNext()));
                }
            } else {
                addUniqueNumbersFromLevel(t.getLeft(), level - 1, list);
                addUniqueNumbersFromLevel(t.getRight(), level - 1, list);
            }
        }
    }
    public static int numOfUniqueNumbers(BinNode<Integer> tree) {
        NodeClass<Integer> list = new NodeClass<>(0);
        int heightOfTree = height(tree);
        int counter = 0;
        while (counter < heightOfTree) {
            addUniqueNumbersFromLevel(tree, counter, list);
            counter+=2;
        }
        int num = 0;
        NodeClass<Integer> p = list.getNext();
        while (p != null) {
            num++;
            p = p.getNext();
        }
        return num;
    }
}
