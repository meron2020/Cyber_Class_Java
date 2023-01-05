package Grade_11.DataStructures.Queue.P_153.Q8;

import Grade_11.DataStructures.Queue.Queue;

public class Program {
    public static Queue<Integer> mergeLines(Queue<Integer> q1, Queue<Integer> q2) {
        q1.insert(null);
        while (!q2.isEmpty()) {
            while (q1.head() != null || q2.head() > q1.head()) {
                q1.insert(q1.remove());
            }
            q1.insert(q2.remove());
        }
        q1.remove();
        return q1;
    }
}
