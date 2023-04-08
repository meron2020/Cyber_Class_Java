package Grade_11.PassoverExercises.Question6;

import Grade_11.DataStructures.NodeClass;

public class LinkedListExercise {
    public static NodeClass<Integer> returnLastEven(NodeClass<Integer> list) {
        NodeClass<Integer> p = list.getNext();
        while ( p != null && p.getValue() % 2 == 1) {
            p = p.getNext();
        }
        if (p == null) {
            return list;
        }
        return returnLastEven(p);
    }

    public static NodeClass<Integer> allOddNumbers(NodeClass<Integer>[] listArray) {
        NodeClass<Integer> demi = new NodeClass<>(0);
        for (int i = 0; i < listArray.length; i++) {
            NodeClass<Integer> lastEven = returnLastEven(listArray[i]);
            while (lastEven.getNext() != null) {
                demi.setNext(lastEven);
                lastEven.setNext(lastEven.getNext().getNext());
            }
        }
        return demi.getNext();
    }

    public static void main(String[] args) {
        NodeClass<Integer> list = NodeClass.buildListInteger();
        System.out.println(returnLastEven(list));
    }
}
