package Grade_11.DataStructures.Node.BookQuestions.Page_99.Q49;

import Grade_11.DataStructures.Node.Node;

public class ListOfTavs {
    public static Node<Character> createList(Node<TavAndNum> list) {
        Node<Character> listToReturn = new Node<>('c');
        Node<Character> pos = listToReturn;
        Node<TavAndNum> p = list;
        while (p != null) {
            for (int i = 0; i < p.getValue().getNum(); i++) {
                pos.setNext(new Node<>(p.getValue().getTav()));
                pos = pos.getNext();
            }
            p = p.getNext();
        }
        return listToReturn.getNext();
    }
}
