package Grade_11.DataStructures.Node.BookQuestions.Page_95;

import Grade_11.DataStructures.NodeClass;

public class P95Q27 {
    public static NodeClass<Integer> deleteSequenceBiggerThanTwo(NodeClass<Integer> list, int num) {
        NodeClass<Integer> pos1 = list;
        while (pos1.getNext().getValue() != num) {
            pos1 = pos1.getNext();
        }
        NodeClass<Integer> pos2 = pos1;
        while (pos2.getNext() != null) {
            if (pos2.getNext().getValue() == num) {
                pos2 = pos2.getNext();
            }
        }
        pos1.setNext(pos2.getNext());

        return list;
    }

    public static NodeClass<Integer> sequenceBiggerThanTwo(NodeClass<Integer> list) {
        NodeClass<Integer> first = new NodeClass<Integer>(0, list);
        NodeClass<Integer> pos1 = first;
        int counter = 1;
        while (pos1.getNext() != null) {
            int currentValue = pos1.getValue();
            if (currentValue == pos1.getNext().getValue()) {
                counter++;
            } else {
                if (counter > 2) {
                    first = deleteSequenceBiggerThanTwo(first, currentValue);
                }
                counter = 1;
            }
            pos1 = pos1.getNext();
        }
        if (counter > 2) {
            first = deleteSequenceBiggerThanTwo(first, pos1.getValue());
        }

        return first.getNext();
    }

    public static void main(String[] args) {
        NodeClass<Integer> list = NodeClass.buildListInteger();
        list = sequenceBiggerThanTwo(list);
        NodeClass.printList(list);
    }
}
