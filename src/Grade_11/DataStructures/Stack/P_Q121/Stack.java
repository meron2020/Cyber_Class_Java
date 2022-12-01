package Grade_11.DataStructures.Stack.P_Q121;

import Grade_11.DataStructures.NodeClass;

public class Stack<T> {

    private NodeClass<T> head;

    public Stack() {
        this.head = null;
    }

    public void push(T x) {
        NodeClass<T> temp = new NodeClass<T>(x);
        temp.setNext(head);
        head = temp;
    }

    public T pop() {
        T x = head.getValue();
        head = head.getNext();
        return x;
    }

    public T top() {
        return head.getValue();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public String toString() {
        String temp = head.toString();
        return "top -> " + temp.substring(0, temp.length() - 4) + "bottom";
    }

    public static Stack<Integer> clone(Stack<Integer> s1) {
        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> s3 = new Stack<Integer>();
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        while (!s2.isEmpty()) {
            int x = s2.pop();
            s1.push(x);
            s3.push(x);
        }
        return s3;

    }

}
