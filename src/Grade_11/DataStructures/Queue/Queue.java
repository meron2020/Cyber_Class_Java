package Grade_11.DataStructures.Queue;

import Grade_11.DataStructures.NodeClass;

public class Queue<T>
{
    public NodeClass<T> first;
    public NodeClass<T> last;


    public Queue()
    {
        this.first = null;
        this.last = null;
    }

    public void insert(T x)
    {
        NodeClass<T> temp = new NodeClass<T>(x);
        if (first == null)
            first = temp;
        else
            last.setNext( temp);
        last = temp;
    }

    public T remove()
    {
        T x =  first.getValue();
        first = first.getNext();
        if (first == null)
            last = null;
        return  x;
    }

    public T top()
    {
        return  first.getValue();
    }

    public boolean isEmpty()
    {
        return first == null;
    }

    public String toString()
    {
        String temp = first.toString();
        return "head -> " + temp.substring(0, temp.length()-4) + " end";
    }
}
