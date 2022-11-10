package Grade_11.DataStructures.IntNode;

public class IntNode {
    public IntNode(int value, IntNode next) {
        this.next = next;
        this.value = value;
    }

    public IntNode(int value) {
        this.next = null;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntNode getNext() {
        return next;
    }

    public void setNext(IntNode next) {
        this.next = next;
    }

    private int value;
    private IntNode next;


}
