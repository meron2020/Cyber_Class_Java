package Grade_11.DataStructures.Queue.P_152.Q4;

import Grade_11.DataStructures.Queue.Queue;

public class GoldBall {
    public static boolean findGoldBall(Queue<String> ballQueue, int guess) {
        for (int i = 0; i < guess - 1; i++) {
            ballQueue.insert(ballQueue.remove());
        }
        return ballQueue.head().equals("gold");
    }
}
