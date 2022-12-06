package Grade_11.DataStructures.Node.ClassExercises.OrderedList;

import Grade_11.DataStructures.NodeClass;
import Grade_11.DataStructures.Stack.P_Q121.Stack;
import org.w3c.dom.Node;

import java.util.Scanner;

public class OrderedList {
    public static NodeClass<Integer> insertIntoOrderedList(NodeClass<Integer> list, int numToAdd) {
        NodeClass<Integer> nodeToAdd = new NodeClass<>(numToAdd);
        NodeClass<Integer> p = new NodeClass<>(0, list);
        list = p;
        while (p.getNext() != null && p.getNext().getValue() < numToAdd) {
            p = p.getNext();
        }

        nodeToAdd.setNext(p.getNext());
        p.setNext(nodeToAdd);
        return list.getNext();
}

    public static NodeClass<Integer> createSortedStack() {
        Scanner reader = new Scanner(System.in);
        NodeClass<Integer> list = new NodeClass<>(reader.nextInt());
        int num = reader.nextInt();
        while (num != -999) {
            list = insertIntoOrderedList(list, num);
            num = reader.nextInt();
        }
        return list;
    }
}

