package Grade_11.DataStructures.Node.BookQuestions.Page_95;

import Grade_11.DataStructures.IntNode.IntNode;
import Grade_11.DataStructures.Node.Node;

public class EvenFirstOddSecond {
    public static Node<Integer> evenFirstOddSecond(Node<Integer> list) {
        Node<Integer> first = list;
        Node<Integer> p = first;
        while (p.getNext() != null) {
            if (p.getNext().getValue() % 2 == 0) {
                Node<Integer> nodeToMove = p.getNext();
                p.setNext(nodeToMove.getNext());
                nodeToMove.setNext(first);
                first = nodeToMove;
            }
        }
        return first;
    }
}
