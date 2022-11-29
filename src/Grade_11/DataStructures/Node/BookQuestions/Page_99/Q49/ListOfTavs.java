package Grade_11.DataStructures.Node.BookQuestions.Page_99.Q49;

import Grade_11.DataStructures.NodeClass;

public class ListOfTavs {
    public static NodeClass<Character> createList(NodeClass<TavAndNum> list) {
        NodeClass<Character> listToReturn = new NodeClass<>('c');
        NodeClass<Character> pos = listToReturn;
        NodeClass<TavAndNum> p = list;
        while (p != null) {
            for (int i = 0; i < p.getValue().getNum(); i++) {
                pos.setNext(new NodeClass<>(p.getValue().getTav()));
                pos = pos.getNext();
            }
            p = p.getNext();
        }
        return listToReturn.getNext();
    }

    public static NodeClass<TavAndNum> zip(NodeClass<Character> list) {
        NodeClass<TavAndNum> listToReturn = new NodeClass<>(new TavAndNum(0, 'l'));
        NodeClass<Character> pos = list;

        while(pos != null) {
            int counter = 1;
            Character character = pos.getValue();
            NodeClass<Character> p = pos;
            while (p != null && p.getValue() == character) {
                counter++;
                p = p.getNext();
            }
            pos = p;
            listToReturn.setNext(new NodeClass<TavAndNum>(new TavAndNum(counter, character)));
        }
        return listToReturn.getNext();
    }
}
