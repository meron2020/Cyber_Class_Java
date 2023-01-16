package Grade_11.DataStructures.Queue.ClassExercises;

import Grade_11.DataStructures.NodeClass;
import Grade_11.DataStructures.Queue.Queue;

public class NumberInQueueList {
    public static int numberInQueueList(NodeClass<Queue<Integer>> list, int num) {
        NodeClass<Queue<Integer>> p = list;
        int counter = 0;
        while (p != null) {
            if (Queue.exist(p.getValue(), num)) {
                counter++;
            }
            p = p.getNext();
        }
        return counter;
    }
}
