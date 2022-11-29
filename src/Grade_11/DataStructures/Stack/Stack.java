package Grade_11.DataStructures.Stack;

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


}
