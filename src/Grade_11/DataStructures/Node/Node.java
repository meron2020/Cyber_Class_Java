package Grade_11.DataStructures.Node;

import java.util.Objects;
import java.util.Scanner;

public class Node<T> {
    private T value;
    private Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public static void printList(Node<Integer> list) {
        Node<Integer> p = list;
        while (p != null) {
            System.out.println(p.getValue());
            p = p.getNext();
        }
    }

    public static Node<Character> buildList1() {
        //from first to last
        Scanner reader = new Scanner(System.in);
        System.out.println("enter char, enter @ to stop");
        char n = reader.next().charAt(0);
        if (n == '@')
            return null;

        Node<Character> first = new Node<Character>(n);
        Node<Character> last = first;

        System.out.println("enter char, enter @ to stop");
        n = reader.next().charAt(0);
        while (n != '@') {
            last.setNext(new Node<Character>(n));
            last = last.getNext();
            System.out.println("enter char, enter @ to stop");
            n = reader.next().charAt(0);
        }
        return first;
    }

    public static Node<String> buildListString() {
        //from first to last
        Scanner reader = new Scanner(System.in);
        System.out.println("enter a string, enter @ to stop");
        String n = reader.next();
        if (Objects.equals(n, "@"))
            return null;

        Node<String> first = new Node<String>(n);
        Node<String> last = first;

        System.out.println("enter a string, enter @ to stop");
        n = reader.next();
        while (!Objects.equals(n, "@")) {
            last.setNext(new Node<String>(n));
            last = last.getNext();
            System.out.println("enter char, enter @ to stop");
            n = reader.next();
        }
        return first;
    }

    public static Node<Integer> buildListInteger() {
        //from first to last
        Scanner reader = new Scanner(System.in);
        System.out.println("enter an integer, enter -999 to stop");
        Integer n = reader.nextInt();
        if (Objects.equals(n, -999))
            return null;

        Node<Integer> first = new Node<Integer>(n);
        Node<Integer> last = first;

        System.out.println("enter a string, enter -999 to stop");
        n = reader.nextInt();
        while (!Objects.equals(n, -999)) {
            last.setNext(new Node<Integer>(n));
            last = last.getNext();
            System.out.println("enter char, enter -999 to stop");
            n = reader.nextInt();
        }
        return first;
    }

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public String toString() {
        return value + " --> " + next;
    }

    public boolean hasNext() {
        return next != null;
    }
}
