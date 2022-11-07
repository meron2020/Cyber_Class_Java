package DataStructures.IntNode.HW;

import DataStructures.IntNode.IntNode;
// Page 76 Question 6
public class NoDoubles {
    public static IntNode noDoubles(IntNode l1) {
        IntNode l2 = new IntNode(10);
        IntNode last = l2;
        IntNode p = l1;
        while (p != null) {
            int valueToCheck = p.getValue();
            boolean valueInL2 = false;
            IntNode n = l2;
            while  (n != null) {
                if (n.getValue() == valueToCheck) {
                    valueInL2 = true;
                    break;
                }
                n = n.getNext();
            }
            if (valueInL2) {
                break;
            }
            else {
                last.setNext(new IntNode(valueToCheck));
                last = last.getNext();
            }

            p = p.getNext();
        }

        return l2.getNext();
    }
}
