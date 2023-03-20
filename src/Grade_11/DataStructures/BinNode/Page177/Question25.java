package Grade_11.DataStructures.BinNode.Page177;

import Grade_11.DataStructures.BinNode.BinNode;

public class Question25 {
    public static BinNode<Character> findNode(BinNode<Character> t, Character c) {
        if (t.getValue() == c) {
            return t;
        }
        if (t.hasLeft()) {
            findNode(t.getLeft(),c);
        }
        if (t.hasRight()) {
            findNode(t.getRight(), c);
        }
        return null;
    }
    public static boolean isDescendant(BinNode<Character> t, Character c1, Character c2) {
        BinNode<Character> c1Node = findNode(t, c1);
        BinNode<Character> c2Node = findNode(t, c2);
        return BinNode.existCharacter(c1Node, c2) || BinNode.existCharacter(c2Node, c1);
    }
}
