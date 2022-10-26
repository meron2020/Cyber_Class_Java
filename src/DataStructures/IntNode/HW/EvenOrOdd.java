package DataStructures.IntNode.HW;

import DataStructures.IntNode.IntNode;

public class EvenOrOdd {
    public static char moreEvenOrOdd(IntNode firstInList) {
        int oddNumbers = 0;
        int evenNumbers = 0;
        IntNode p = firstInList;
        while (p != null) {
            if (p.getValue() % 2 == 0) {
                evenNumbers++;
            }
            else {
                oddNumbers++;
            }
            p = p.getNext();
        }

        if (oddNumbers > evenNumbers) {
            return 'e';
        }
        else if (evenNumbers > oddNumbers){
            return 'z';
        }
        else {
            return 's';
        }
    }


}
