package Grade_11.StudiesForBagrut.Bagrut2019.Question5;

import Grade_11.DataStructures.NodeClass;
import Grade_11.DataStructures.Queue.Queue;

public class QueueToNumber {
    public static int toNumber(Queue<Integer> queue) {
        int counter = 0;
        int numToReturn = 0;
        while (!queue.isEmpty()) {
            numToReturn += queue.remove() * Math.pow(10, counter);
            counter++;
        }

        return numToReturn;
    }

    public static int bigNumber(NodeClass<Queue<Integer>> list) {

    }
}
