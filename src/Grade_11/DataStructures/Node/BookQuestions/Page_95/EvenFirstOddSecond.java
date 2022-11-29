package Grade_11.DataStructures.Node.BookQuestions.Page_95;

import Grade_11.DataStructures.NodeClass;

public class EvenFirstOddSecond {
    public static NodeClass<Integer> evenFirstOddSecond(NodeClass<Integer> list) {
        NodeClass<Integer> first = list;
        NodeClass<Integer> p = first;
        while (p.getNext() != null) {
            if (p.getNext().getValue() % 2 == 0) {
                NodeClass<Integer> nodeClassToMove = p.getNext();
                p.setNext(nodeClassToMove.getNext());
                nodeClassToMove.setNext(first);
                first = nodeClassToMove;
            }
        }
        return first;
    }
}
