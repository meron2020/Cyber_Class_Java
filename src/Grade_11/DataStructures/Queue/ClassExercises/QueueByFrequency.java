package Grade_11.DataStructures.Queue.ClassExercises;

import Grade_11.DataStructures.Queue.Queue;

public class QueueByFrequency {
    public static Queue<Integer> queueByFrequency(Queue<Integer> queue) {
        Queue<Integer> temp = Queue.copy(queue);
        Queue<Integer> queueToReturn = new Queue<Integer>();
        while (!temp.isEmpty()) {
            int current = temp.remove();
            int count = 1;
            temp.insert(null);
            while (temp.head() != null) {
                if (temp.head() == current) {
                    temp.remove();
                    count++;
                }
                else {
                    temp.insert(temp.remove());
                }
            }
            temp.remove();
            queueToReturn.insert(current);
            queueToReturn.insert(count);
        }
        return queueToReturn;
    }
}
