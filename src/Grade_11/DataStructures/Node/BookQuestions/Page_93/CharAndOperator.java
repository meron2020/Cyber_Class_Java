package Grade_11.DataStructures.Node.BookQuestions.Page_93;

import Grade_11.DataStructures.Node.Node;

//Page 93 Question 17
public class CharAndOperator {
    public static int calc(char ch1, char op, char ch2) {
        int n1 = (int) ch1 - (int) '0';
        int n2 = (int) ch2 - (int) '0';

        if (op == '+') {
            return n1 + n2;
        }
        if (op == '-') {
            return n1 - n2;
        }
        if (op == '*') {
            return n1 * n2;
        }
        return n1 / n2;
    }

    public static Node<Integer> charAndOperator(Node<Character> list) {
        Node<Integer> listToReturn = new Node<Integer>(0);
        Node<Integer> pos = listToReturn;
        Node<Character> p = list;
        while (p != null) {
            int x = calc(p.getValue(), p.getNext().getValue(), p.getNext().getNext().getValue());
            pos.setNext(new Node<Integer>(x));
            pos = pos.getNext();
            p = p.getNext().getNext().getNext();
        }
        return listToReturn.getNext();
    }

    public static void main(String[] args) {
        Node<Integer> listReturned = charAndOperator(Node.buildList1());
        Node<Integer> p = listReturned;
        while (p != null) {
            System.out.println(p.getValue());
            p = p.getNext();
        }
    }

}
