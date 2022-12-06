package Grade_11.DataStructures.Node.BookQuestions.Page_96.Q_35;

import Grade_11.DataStructures.NodeClass;

public class MergedOrderedLists {
    public static NodeClass<Integer> merge(NodeClass<Integer> list1, NodeClass<Integer> list2) {
        NodeClass<Integer> listToReturn = new NodeClass<>(0);
        NodeClass<Integer> p3 = listToReturn;
        NodeClass<Integer> p1 = list1;
        NodeClass<Integer> p2 = list2;
        while (p2.hasNext() && p1.hasNext()) {
            if (p2.getValue() > p1.getValue()) {
                p3.setNext(p1);
                p1 = p1.getNext();
            }
            else if (p1.getValue() > p2.getValue()) {
                p3.setNext(p2);
                p2 = p2.getNext();
            }
            else {
                p3.setNext(p1);
                p1 = p1.getNext();
                p3 = p3.getNext();
                p3.setNext(p2);
                p2 = p2.getNext();
            }
            p3 = p3.getNext();
        }
        if (p2.hasNext()) {
            while (p2 != null) {
                p3.setNext(p2);
                p2 = p2.getNext();
                p3 = p3.getNext();
            }
        }
        else {
            while (p1 != null) {
                p3.setNext(p1);
                p1 = p1.getNext();
                p3 = p3.getNext();
            }
        }
        return listToReturn.getNext();
    }
}
