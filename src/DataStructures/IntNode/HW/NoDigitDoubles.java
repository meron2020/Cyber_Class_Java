package DataStructures.IntNode.HW;

import DataStructures.IntNode.IntNode;
//Page 76 Question 6
public class NoDigitDoubles {
    public static IntNode noDigitDoubles() {
        IntNode l1 = new IntNode((int) (Math.random() * 100));
        IntNode p = l1;
        for (int i = 0; i < 49; i++) {
            p.setNext(new IntNode((int) (Math.random() * 100)));
            p = p.getNext();
        }
        IntNode l2 = new IntNode(10);
        IntNode last = l2;
        p = l1;
        while (p != null) {
            int valueToCheck = p.getValue();
            boolean valueInL2 = false;
            IntNode n = l2;
            while (n != null) {
                if (n.getValue() == valueToCheck) {
                    valueInL2 = true;
                    break;
                }
                n = n.getNext();
            }
            if (valueInL2) {
                break;
            } else {
                if (valueToCheck / 10 != valueToCheck % 10) {
                    last.setNext(new IntNode(valueToCheck));
                    last = last.getNext();
                }
            }

            p = p.getNext();
        }

        return l2.getNext();
    }
}
