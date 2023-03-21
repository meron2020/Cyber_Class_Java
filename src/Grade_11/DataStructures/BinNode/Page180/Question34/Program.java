package Grade_11.DataStructures.BinNode.Page180.Question34;

import Grade_11.DataStructures.BinNode.BinNode;
import Grade_11.DataStructures.NodeClass;

public class Program {
    public static int numRepeat(BinNode<InfoTree> t, char ch) {
        if (t == null) {
            return 0;
        } else {
            if (t.getValue().getCh() == ch) {
                return numRepeat(t.getLeft(), ch) + numRepeat(t.getRight(), ch) + t.getValue().getNum();
            } else {
                return numRepeat(t.getLeft(), ch) + numRepeat(t.getRight(), ch);
            }
        }
    }

    public static char mostRepFinal(BinNode<InfoTree> t) {
        NodeClass<InfoTree> list = new NodeClass<InfoTree>(null);
        mostRepFinal(t, list);
        int max = 0;
        char maxChar = ' ';
        list = list.getNext();
        while (list != null) {
            if (list.getValue().getNum() > max) {
                max = list.getValue().getNum();
                maxChar = list.getValue().getCh();
            }
            list = list.getNext();
        }
        return maxChar;
    }

    public static void mostRepFinal(BinNode<InfoTree> t, NodeClass<InfoTree> list) {
        if (t != null) {
            char ch = t.getValue().getCh();
            int n = t.getValue().getNum();
            boolean found = false;
            NodeClass<InfoTree> p = list.getNext();
            while (p != null && !found) {
                if (p.getValue().getCh() == ch) {
                    p.getValue().add(n);
                    found = true;
                } else {
                    p = p.getNext();
                }
            }
            if (!found) {
                InfoTree f = new InfoTree(ch, n);
                NodeClass<InfoTree> pos = new NodeClass<>(f, list.getNext());
                list.setNext(pos);
                mostRepFinal(t.getLeft(), list);
                mostRepFinal(t.getRight(), list);
            }
        }
    }
}
