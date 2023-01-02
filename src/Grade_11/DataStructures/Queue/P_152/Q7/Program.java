package Grade_11.DataStructures.Queue.P_152.Q7;

import Grade_11.DataStructures.Queue.Queue;

public class Program {
    public static Queue<String> mergeLines(Queue<String> lineToMerge, Queue<String> lineToClose) {
        Queue<String> newLine = new Queue<String>();
        while (!lineToMerge.isEmpty() && !lineToClose.isEmpty()) {
            newLine.insert(lineToMerge.remove());
            newLine.insert(lineToClose.remove());
        }
        if (!lineToClose.isEmpty()) {
            while (!lineToClose.isEmpty()) {
                newLine.insert(lineToClose.remove());
            }
        }
        if (!lineToMerge.isEmpty()) {
            while (!lineToMerge.isEmpty()) {
                newLine.insert(lineToMerge.remove());
            }
        }
        return newLine;
    }
}
