package Grade_11.DataStructures.IntNode.ClassExercises.Page_76;

import Grade_11.DataStructures.IntNode.IntNode;
//Page 76 Question 13
public class ListEvenOrOdd {
    public static void listEvenOrOdd(IntNode list) {
        int counter = 1, secondCounter;
        IntNode p = list;
        while (p != null) {
            counter++;
            p = p.getNext();
        }
        if (counter % 2 == 0) {
            p = list;
            secondCounter = 1;
            while (secondCounter != counter / 2) {
                p = p.getNext();
                secondCounter++;
            }
            System.out.println(Math.max(p.getValue(), p.getNext().getValue()));
        } else {
            list = list.getNext();
            p = list;
            secondCounter = 1;
            while (secondCounter != counter - 1) {
                p = p.getNext();
                secondCounter++;
            }
            p.setNext(null);
        }
    }
}
