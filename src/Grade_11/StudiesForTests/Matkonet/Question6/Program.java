package Grade_11.StudiesForTests.Matkonet.Question6;

import Grade_11.DataStructures.Queue.Queue;

public class Program {
    public static int numberOfSequences(Queue<Integer> queue, int x) {
        int counter = 0;
        queue.insert(null);
        int prior = queue.remove();
        while (queue.head() != null) {
            if (prior != x && queue.head() == x) {
                counter++;
            }
            queue.insert(prior);
            prior = queue.remove();
        }
        queue.remove();
        return counter;
    }
}
