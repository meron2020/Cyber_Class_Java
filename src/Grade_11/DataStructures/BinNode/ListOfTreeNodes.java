package Grade_11.DataStructures.BinNode;

import Grade_11.DataStructures.NodeClass;

public class ListOfTreeNodes {
    public static NodeClass<Integer> tree2List(BinNode<Integer> t) {
        NodeClass<Integer> list = new NodeClass<Integer>(0);
        tree2List(t, list);
        return list.getNext();
    }

    public static void tree2List(BinNode<Integer> t, NodeClass<Integer> list) {
        if (t != null) {
            tree2List(t.getLeft(), list);
            NodeClass<Integer> p = list;
            while (p.hasNext()) {
                p = p.getNext();
            }
            p.setNext(new NodeClass<Integer>(t.getValue()));
            tree2List(t.getRight(), list);
        }
    }

    public static void tree2ListInN(BinNode<Integer> t, NodeClass<Integer> list) {

    }
}
