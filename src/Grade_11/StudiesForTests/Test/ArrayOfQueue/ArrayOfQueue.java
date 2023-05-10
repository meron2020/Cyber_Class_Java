package Grade_11.StudiesForTests.Test.ArrayOfQueue;

import Grade_11.DataStructures.NodeClass;
import Grade_11.DataStructures.Queue.Queue;

public class ArrayOfQueue {
    private Queue<Integer>[] arr;
    private int maxNum;

    public static int lenOfArray() {
        return (int) (Math.random() * 100);
    }

    public ArrayOfQueue() {
        boolean allSame = true;
        for (int i = 0; i < lenOfArray(); i++) {
            this.arr[i] = new Queue<Integer>();
            this.arr[i].insert((int) (Math.random() * 22) + 1);
        }
        for (int i = 1; i < lenOfArray(); i++) {
            if (this.arr[i].head() != this.arr[i-1].head()) {
                allSame = false;
            }
        }
        if (allSame) {
            maxNum = this.arr[0].head();
        }

    }

    public void fillQueue(NodeClass<Integer> list) {
        NodeClass<Integer> p = list;
        while (p != null) {
            int closestDistance = Math.abs(p.getValue() - arr[0].head());
            int queuesInsertedTo = 0;
            for (int i = 0; i < arr.length; i++) {
                if (Math.abs(p.getValue() - arr[i].head()) < closestDistance) {
                    closestDistance = Math.abs(p.getValue() - arr[i].head());
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (Math.abs(p.getValue() - arr[i].head()) == closestDistance) {
                    arr[i].insert(p.getValue());
                    queuesInsertedTo += 1;
                }
            }
            if (queuesInsertedTo == arr.length) {
                if (this.maxNum < p.getValue()) {
                    this.maxNum = p.getValue();
                }
            }
            p = p.getNext();
        }
    }

    // The runtime is O(n**2). The first while loop only runs until two of the same number are generated, so O(n).
    // In fillQueue the while loop runs in O(n) because the whole list needs to be scanned. The for loops have to scan
    // the whole array time while loop moves to the next element in the list. Meaning, for every element in chain, myQueues needs to be scanned.
    // So the runtime is O(n**2).
    public static void program() {
        NodeClass<Integer> chain = new NodeClass<Integer>(0);
        boolean same = false;
        while (!same) {
            int num1 = (int) (Math.random() * 90) + 10;
            int num2 = (int) (Math.random() * 90) + 10;
            NodeClass<Integer> nodeToInsert = new NodeClass<>(Math.max(num1, num2));
            nodeToInsert.setNext(chain.getNext());
            chain.setNext(nodeToInsert);
            if (num1 == num2) {
                same = true;
            }
        }
        ArrayOfQueue myQueues = new ArrayOfQueue();
        myQueues.fillQueue(chain.getNext());
    }
}
