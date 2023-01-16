package Grade_11.DataStructures.Queue.ClassExercises;

import Grade_11.DataStructures.Queue.Queue;

public class CommonElements {
    public static Queue<Integer> commonElements(Queue<Integer> queue1, Queue<Integer> queue2) {
        Queue<Integer> commonElements = new Queue<Integer>();
        queue1.insert(null);
        while (queue1.head() != null) {
            if (Queue.exist(queue2, queue1.head())) {
                commonElements.insert(queue1.head());
            }
            queue1.insert(queue1.remove());
        }
        return commonElements;
    }
}
