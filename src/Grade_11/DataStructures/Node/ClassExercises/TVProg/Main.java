package Grade_11.DataStructures.Node.ClassExercises.TVProg;

import Grade_11.DataStructures.Node.Node;

public class Main {
    public static Node<String> programsInDay(Node<TvProg> list, int day) {
        Node<String> listToReturn = new Node<String>("");
        Node<String> p2 = listToReturn;
        Node<TvProg> p = list;
        while (p != null) {
            if (p.getValue().getDay() == day) {
                p2.setNext(new Node<String>(p.getValue().getName()));
                p2 = p2.getNext();
            }
            p = p.getNext();
        }
        return listToReturn.getNext();
    }
}
