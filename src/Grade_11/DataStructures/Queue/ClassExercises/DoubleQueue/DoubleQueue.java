package Grade_11.DataStructures.Queue.ClassExercises.DoubleQueue;

import Grade_11.DataStructures.Queue.Queue;

public class DoubleQueue {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public static int getQLength(Queue<Integer> queue) {
        int length = 0;
        queue.insert(null);
        while (queue.head() != null) {
            queue.insert(queue.remove());
            length++;
        }
        return length;
    }
    public int getQSize(int i) {
        if (i == 1) {
            return getQLength(this.queue1);
        }
        else {
            return getQLength(this.queue2);
        }
    }

    public void moveElement(int i, int j) {
        if (i == 1) {
            if (j == 1) {
                queue1.insert(queue1.remove());
            }
            else {
                queue2.insert(queue1.remove());
            }
        }
        else {
            if (j == 1) {
                queue1.insert(queue2.remove());
            }
            else {
                queue2.insert(queue2.remove());
            }
        }
    }

}
