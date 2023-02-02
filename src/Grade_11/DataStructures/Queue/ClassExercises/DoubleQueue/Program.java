package Grade_11.DataStructures.Queue.ClassExercises.DoubleQueue;

public class Program {
    public static void MoveLastElements(DoubleQueue dq, int i, int j, int n) {
        for (int k = 0; k < dq.getQSize(i) - n; k++) {
            dq.moveElement(i, i);
        }
        for (int k = 0; k < n; k++) {
            dq.moveElement(i, j);
        }
    }

    public static void Balance(DoubleQueue dq) {
        int q1Size = dq.getQSize(1);
        int q2Size = dq.getQSize(2);
        if (q1Size < q2Size) {
            int numToMove = (q2Size - q1Size) / 2;
            MoveLastElements(dq, 2, 1, numToMove);
        } else {
            int numToMove = (q1Size - q2Size) / 2;
            MoveLastElements(dq, 1, 2, numToMove);
        }
    }
}
