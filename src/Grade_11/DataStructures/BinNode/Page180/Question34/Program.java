package Grade_11.DataStructures.BinNode.Page180.Question34;

import Grade_11.DataStructures.BinNode.BinNode;

public class Program {
    public static int numRepeat(BinNode<InfoTree> t, char ch) {
        if (t == null) {
            return 0;
        }
        else {
            if (t.getValue().getCh() == ch) {
                return numRepeat(t.getLeft(), ch) + numRepeat(t.getRight(), ch) + t.getValue().getNum();
            }
            else {
                return numRepeat(t.getLeft(), ch) + numRepeat(t.getRight(), ch);
            }
        }
    }

    public static char mostRepFinal(BinNode<InfoTree> t) {

    }
}
