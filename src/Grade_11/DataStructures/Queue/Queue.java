package Grade_11.DataStructures.Queue;

import Grade_11.DataStructures.NodeClass;

public class Queue<T> {
    public NodeClass<T> head;
    public Queue() {
        this.head = null;
    }

    public static boolean exist(Queue<Integer> q, int num) {
        Queue<Integer> q2 = new Queue<Integer>();
        boolean found = false;
        while (!q.isEmpty()) {
            if (num == q.head()) {
                found = true;
            }
            q2.insert(q.remove());
        }
        while (!q2.isEmpty()) {
            q.insert(q.remove());
        }
        return found;
    }

    public static boolean existString(Queue<String> q, String s) {
        Queue<String> q2 = new Queue<String>();
        boolean found = false;
        while (!q.isEmpty()) {
            if (s.equals(q.head())) {
                found = true;
            }
            q2.insert(q.remove());
        }
        while (!q2.isEmpty()) {
            q.insert(q.remove());
        }
        return found;
    }

    public static Queue<Integer> copy(Queue<Integer> q) {
        Queue<Integer> q2 = new Queue<Integer>();
        q.insert(null);
        while (q.head() != null) {
            q2.insert(q.head());
            q.insert(q.remove());
        }
        q.remove();
        return q2;
    }

    public static boolean existSep(Queue<Integer> q, int num) {
        boolean found = false;
        Queue<Integer> temp = new Queue<Integer>();
        int x = q.remove();
        temp.insert(x);
        while (!q.isEmpty()) {
            if (x == num) {
                if (x == q.head()) {
                    found = true;
                }
            }
            x = q.remove();
            temp.insert(x);
        }
        while (!temp.isEmpty()) {
            q.insert(temp.remove());
        }
        return found;
    }

    public static void update(Queue<Integer> q) {
        Queue<Integer> temp = new Queue<Integer>();
        int x;
        while (!q.isEmpty()) {
            x = q.remove();
            if (!exist(temp, x)) {
                temp.insert(x);
            }
        }
        while (!temp.isEmpty()) {
            q.insert(temp.remove());
        }
    }

    public void insert(T x) {
        NodeClass<T> temp = new NodeClass<T>(x);
        if (head == null)
            head = temp;
        else {
            NodeClass<T> p = this.head;
            while (p.getNext() != null) {
                p = p.getNext();
            }
            p.setNext(temp);
        }
    }

    public T remove() {
        T x = head.getValue();
        head = head.getNext();
        return x;
    }

    public T head() {
        return head.getValue();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public String toString() {
        String temp = head.toString();
        return "head -> " + temp.substring(0, temp.length() - 4) + " end";
    }
}