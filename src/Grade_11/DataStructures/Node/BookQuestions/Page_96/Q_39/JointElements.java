package Grade_11.DataStructures.Node.BookQuestions.Page_96.Q_39;

import Grade_11.DataStructures.NodeClass;

public class JointElements {
    public static NodeClass<Integer> findJointElements(NodeClass<Integer> list1, NodeClass<Integer> list2) {
        NodeClass<Integer> p1 = list1;
        NodeClass<Integer> p2 = list2;
        NodeClass<Integer> jointElements = new NodeClass<>(0);
        NodeClass<Integer> p3 = jointElements;
        while (p1 != null && p2 != null) {
            if (p1.getValue() == p2.getValue()) {
                p3.setNext(new NodeClass<Integer>(p1.getValue()));
                p3 = p3.getNext();
            }
            else if (p1.getValue() > p2.getValue()) {
                p2 = p2.getNext();
            }
            else {
                p1 = p1.getNext();
            }
        }
        return jointElements.getNext();
    }
}
