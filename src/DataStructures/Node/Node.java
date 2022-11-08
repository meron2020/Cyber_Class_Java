package DataStructures.Node;

import java.util.Scanner;

public class Node<T>
{
    private T value;
    private Node<T> next;

    public Node(T value)
    {
        this. value =  value;
        this.next = null;
    }
    public static Node<Character> buildList1()
    {
        //from first to last
        Scanner reader=new Scanner(System.in);
        System.out.println("enter char, enter @ to stop");
        char n=reader.next().charAt(0);
        if (n=='@')
            return null;

        Node<Character> first=new Node<Character>(n);
        Node<Character> last=first;

        System.out.println("enter char, enter @ to stop");
        n=reader.next().charAt(0);
        while (n!='@')
        {
            last.setNext(new Node<Character>(n));
            last=last.getNext();
            System.out.println("enter char, enter @ to stop");
            n=reader.next().charAt(0);
        }
        return first;
    }

    public Node(T  value, Node<T> next)
    {
        this. value =  value;
        this.next = next;
    }

    public T getValue()
    {
        return   value;
    }

    public Node<T> getNext()
    {
        return next;
    }

    public void setValue(T  value)
    {
        this. value =  value;
    }

    public void setNext(Node<T>  next)
    {
        this.next = next;
    }

    public String toString()
    {
        return  value + " --> " + next;
    }
}
