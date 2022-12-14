package Grade_11.StudiesForTests;

import java.util.Objects;
import java.util.Scanner;

public class NodeClass<T> {
    private T value;
    private NodeClass<T> next;

    public NodeClass(T value) {
        this.value = value;
        this.next = null;
    }

    public static void printList(NodeClass<Integer> list) {
        NodeClass<Integer> p = list;
        while (p != null) {
            System.out.println(p.getValue());
            p = p.getNext();
        }
    }

    public static NodeClass<Character> buildList1() {
        //from first to last
        Scanner reader = new Scanner(System.in);
        System.out.println("enter char, enter @ to stop");
        char n = reader.next().charAt(0);
        if (n == '@')
            return null;

        NodeClass<Character> first = new NodeClass<Character>(n);
        NodeClass<Character> last = first;

        System.out.println("enter char, enter @ to stop");
        n = reader.next().charAt(0);
        while (n != '@') {
            last.setNext(new NodeClass<Character>(n));
            last = last.getNext();
            System.out.println("enter char, enter @ to stop");
            n = reader.next().charAt(0);
        }
        return first;
    }

    public static NodeClass<String> buildListString() {
        //from first to last
        Scanner reader = new Scanner(System.in);
        System.out.println("enter a string, enter @ to stop");
        String n = reader.next();
        if (Objects.equals(n, "@"))
            return null;

        NodeClass<String> first = new NodeClass<String>(n);
        NodeClass<String> last = first;

        System.out.println("enter a string, enter @ to stop");
        n = reader.next();
        while (!Objects.equals(n, "@")) {
            last.setNext(new NodeClass<String>(n));
            last = last.getNext();
            System.out.println("enter char, enter @ to stop");
            n = reader.next();
        }
        return first;
    }

    public static NodeClass<Integer> buildListInteger() {
        //from first to last
        Scanner reader = new Scanner(System.in);
        System.out.println("enter an integer, enter -999 to stop");
        Integer n = reader.nextInt();
        if (Objects.equals(n, -999))
            return null;

        NodeClass<Integer> first = new NodeClass<Integer>(n);
        NodeClass<Integer> last = first;

        System.out.println("enter a string, enter -999 to stop");
        n = reader.nextInt();
        while (!Objects.equals(n, -999)) {
            last.setNext(new NodeClass<Integer>(n));
            last = last.getNext();
            System.out.println("enter char, enter -999 to stop");
            n = reader.nextInt();
        }
        return first;
    }

    public NodeClass(T value, NodeClass<T> next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public NodeClass<T> getNext() {
        return next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(NodeClass<T> next) {
        this.next = next;
    }

    public String toString() {
        return value + " --> " + next;
    }

    public boolean hasNext() {
        return next != null;
    }
}
