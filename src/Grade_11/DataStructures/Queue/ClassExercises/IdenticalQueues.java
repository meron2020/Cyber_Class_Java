package Grade_11.DataStructures.Queue.ClassExercises;


import Grade_11.DataStructures.NodeClass;
import Grade_11.DataStructures.Queue.Queue;

public class IdenticalQueues {
    public static boolean identicalQueues(Queue<Integer> queue1, Queue<Integer> queue2) {
        Queue<Integer> temp1 = new Queue<Integer>();
        Queue<Integer> temp2 = new Queue<Integer>();

        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            if (queue1.head() != queue2.head()) {
                while (!temp1.isEmpty()) {
                    queue1.insert(temp1.remove());
                }
                while (!temp2.isEmpty()) {
                    queue2.insert(temp2.remove());
                }
                return false;
            }

            temp1.insert(queue1.remove());
            temp2.insert(queue2.remove());

        }

        if (queue1.isEmpty() && queue2.isEmpty()) {
            return true;
        }
        return false;
    }


    public static int listOfIdenticalQueues(NodeClass<Queue<Integer>> queueList) {
        NodeClass<Queue<Integer>> p = queueList.getNext();
        int counter = 0;
        while (p != null) {
            if (identicalQueues(queueList.getValue(), p.getValue())) {
                counter++;
            }
            p = p.getNext();
        }

        return counter;
    }
}
