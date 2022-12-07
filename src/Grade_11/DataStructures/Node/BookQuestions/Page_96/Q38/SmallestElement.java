package Grade_11.DataStructures.Node.BookQuestions.Page_96.Q38;

import Grade_11.DataStructures.NodeClass;

public class SmallestElement {
    public static Integer findSmallestJointElement(NodeClass<Integer> list1, NodeClass<Integer> list2) {
        NodeClass<Integer> p1 = list1;
        NodeClass<Integer> p2 = list2;
        while (p1 != null && p2 != null) {
            if (p1.getValue() == p2.getValue()) {
                return p1.getValue();
            }
            else if (p1.getValue() < p2.getValue()) {
                p1 = p1.getNext();
            }
            else {
                p2 = p2.getNext();
            }
        }
        return -999;
    }
}
