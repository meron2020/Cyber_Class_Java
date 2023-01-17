package Grade_11.DataStructures.Queue.ClassExercises;

import Grade_11.DataStructures.Queue.Queue;

public class BiggestCoupleSum {
    public static int findBiggestSumCouple(Queue<Integer> queue) {
        int biggestSum = 0;
        queue.insert(null);
        while (queue.head() != null) {
            int taken = queue.remove();
            biggestSum = Math.max(biggestSum, taken + queue.head());
            queue.insert(taken);
        }
        queue.remove();
        return biggestSum;
    }
    public static int biggestSumCouple(Queue<Integer> queue1, Queue<Integer> queue2) {
        queue1.insert(null);
        int q2BiggestSum = findBiggestSumCouple(queue2);
        while (queue1.head() != null) {
            int taken = queue1.remove();
            int coupleSum = taken + queue2.head();
            if (coupleSum > q2BiggestSum) {
                return coupleSum;
            }
            queue1.insert(taken);
        }
        queue1.remove();
        return 0;
    }
}
