package Grade_11.StudiesForTests.Matkonet.Question6;

import Grade_11.DataStructures.NodeClass;
import Grade_11.DataStructures.Queue.Queue;

public class Triple {
    private int num;
    private int nRetzef;
    private int total;

    // The function runs in O(n**2).
    public static NodeClass<Triple> returnTripleFromSequence(Queue<Integer> queue) {
        NodeClass<Triple> list = new NodeClass<>(new Triple(0,0,0));
        while (!queue.isEmpty()) {
            int num = queue.head();
            NodeClass<Triple> p = list.getNext();
            boolean found = false;
            while (p != null && !found) {
                if (p.getValue().getNum() == num) {
                    p.getValue().setTotal(p.getValue().getTotal()+1);
                    found = true;
                }
                p = p.getNext();
            }
            if (!found) {
                list.setNext(new NodeClass<>(new Triple(num, Program.numberOfSequences(queue, num), 1), list.getNext()));
            }
            queue.remove();
        }
        return list.getNext();
    }

    public Triple(int num, int nRetzef, int total) {
        this.num = num;
        this.nRetzef = nRetzef;
        this.total = total;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getnRetzef() {
        return nRetzef;
    }

    public void setnRetzef(int nRetzef) {
        this.nRetzef = nRetzef;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
