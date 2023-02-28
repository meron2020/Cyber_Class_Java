package Grade_11.DataStructures.Queue.ClassExercises;

import Grade_11.DataStructures.Queue.Queue;

public class QueueInQueue {
    public static boolean queueInQueue(Queue<Integer> q1, Queue<Integer> q2) {
        q1.insert(null);
        while ( q1.head != null) {
            q1.insert(q1.remove());
        }
        if (q1.head == null) {
            return false;
        }
        else:

    }
}
