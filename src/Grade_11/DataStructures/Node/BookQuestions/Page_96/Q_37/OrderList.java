package Grade_11.DataStructures.Node.BookQuestions.Page_96.Q_37;

import Grade_11.DataStructures.NodeClass;

public class OrderList {
    public static NodeClass<Integer> orderList(NodeClass<Integer> list) {
        NodeClass<Integer> listToReturn = new NodeClass<Integer>(list.getValue());
        NodeClass<Integer> p1 = list.getNext();
        NodeClass<Integer> p2 = listToReturn;
        while (p1 != null) {
            if (p2.getValue() > p1.getValue()) {
                NodeClass<Integer> nodeToRemove = p1;
                p1 = p1.getNext();
                nodeToRemove.setNext(listToReturn);
                listToReturn = nodeToRemove;
            } else {
                boolean inPlace = false;
                while (p2 != null && !inPlace) {

                 if (p2.getNext() == null ||
                            (p2.getValue() < p1.getValue() && p2.getNext().getValue() > p1.getValue())) {
                        NodeClass<Integer> nodeToRemove = p1;
                        p1 = p1.getNext();
                        nodeToRemove.setNext(p2.getNext());
                        p2.setNext(nodeToRemove);
                        inPlace = true;
                    } else {
                        p2 = p2.getNext();
                    }
                }

            }
            p2 = listToReturn;
        }
        return listToReturn;
    }

    public static void main(String[] args) {
        NodeClass<Integer> list = NodeClass.buildListInteger();
        NodeClass.printList(orderList(list));
    }
}
