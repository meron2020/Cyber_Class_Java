package Grade_11.DataStructures.Queue.ClassExercises;

import Grade_11.DataStructures.Queue.Queue;

public class BiggestCoupleSum {
    public static int findBiggestSumCouple(Queue<Integer> queue) {
        int max = 0, s;
        Queue<Integer> q1 = Queue.copy(queue);
        int n1 = q1.remove();
        while (!q1.isEmpty()) {
            s = n1 + q1.head();
            if (s > max) {
                max = s;
            }
            n1 = q1.remove();
        }
        return max;
    }

    public static int biggestSumCouple(Queue<Integer> queue1, Queue<Integer> queue2) {
        Queue<Integer> t = Queue.copy(queue1);
        int q2BiggestSum = findBiggestSumCouple(queue2);
        int x = t.remove();
        while (!t.isEmpty()) {
            if (x + t.head() > q2BiggestSum) {
                return x + t.head();
            }
            x = t.remove();
        }
        return 0;

    }
}
