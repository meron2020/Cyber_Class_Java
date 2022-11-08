package DataStructures.Node.BookQuestions.Page_94;

import DataStructures.Node.Node;

//Page 94 Question 24
public class FirstPlaceOfNumber {
    public static Node<Integer> firstPlaceOfNumber(Node<Integer> list, int num) {
        Node<Integer> p = list;
        while (p != null) {
            if (p.getValue() == num) {
                return p;
            }
            p = p.getNext();
        }
        return null;
    }
}
