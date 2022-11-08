package DataStructures.IntNode.ClassExercises.Page_76;

import DataStructures.IntNode.IntNode;

//Page 76 Question 14
public class DeleteNBiggestNumbers {

    public static IntNode deleteNumberFromList(IntNode list, int num) {
        while (list.getNext() != null) {
            if (list.getNext().getValue() == num) {
                list.setNext(list.getNext().getNext());
                break;
            }
        }
        return list;
    }

    public static void deleteNBiggestNumbers(IntNode list, int n) {
        IntNode p = new IntNode(0, list);
        int largestNum = p.getNext().getValue();
        for (int i = 0; i < n; i++) {
            while (p.getNext() != null) {
                if (p.getNext().getValue() > largestNum) {
                    largestNum = p.getNext().getValue();
                }
                p = p.getNext();
            }
            list = deleteNumberFromList(list, largestNum);
        }
    }
}
