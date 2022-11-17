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

    public static Node<TavAndNum> zip(Node<Character> list) {
        Node<TavAndNum> listToReturn = new Node<>(new TavAndNum(0, 'l'));
        Node<Character> pos = list;

        while(pos != null) {
            int counter = 1;
            Character character = pos.getValue();
            Node<Character> p = pos;
            while (p != null && p.getValue() == character) {
                counter++;
                p = p.getNext();
            }
            pos = p;
            listToReturn.setNext(new Node<TavAndNum>(new TavAndNum(counter, character)));
        }
        return listToReturn.getNext();
    }
}
