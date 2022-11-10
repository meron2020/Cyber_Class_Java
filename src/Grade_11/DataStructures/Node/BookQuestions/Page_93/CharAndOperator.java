package Grade_11.DataStructures.Node.BookQuestions.Page_93;

import Grade_11.DataStructures.Node.Node;

//Page 93 Question 17
public class CharAndOperator {
    public static Node<Integer> charAndOperator(Node<Character> list) {
        Node<Integer> listToReturn = new Node<Integer>(0);
        Node<Integer> pos = listToReturn;
        Node<Character> p = list;
        while (p.getNext().getNext() != null) {
            int firstNum = (int) p.getValue() - (int) '0';
            int secondNum = (int) p.getNext().getNext().getValue() - (int) '0';
            char operator = p.getNext().getValue();
            if (operator == '+') {
                listToReturn.setNext(new Node<>(firstNum + secondNum));

            } else if (operator == '-') {
                listToReturn.setNext(new Node<>(firstNum - secondNum));
            } else if (operator == '*') {
                listToReturn.setNext(new Node<>(firstNum * secondNum));
            } else if (operator == '/') {
                listToReturn.setNext(new Node<>(firstNum / secondNum));
            }
            pos = pos.getNext();
            p = p.getNext().getNext();
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
