package DataStructures.IntNode.HW;

import DataStructures.IntNode.IntNode;
//Page 76 Question 7
public class NumOfConsequentNumbers {
    public static boolean numOfConsequentNumbers(IntNode lis, int num) {
        int consequentNumCounter = 1;
        IntNode p = lis;
        while (p.getNext() != null) {
            if (p.getNext().getValue() == p.getValue() + 1) {
                consequentNumCounter++;
            }
            else {
                if (consequentNumCounter == num) {
                    return true;
                }
                consequentNumCounter = 1;
            }
            p = p.getNext();
        }
        return false;
    }
}
