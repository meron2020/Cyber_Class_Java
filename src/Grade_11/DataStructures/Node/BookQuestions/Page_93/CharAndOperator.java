package Grade_11.DataStructures.Node.BookQuestions.Page_93;

import Grade_11.DataStructures.NodeClass;

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

    public static NodeClass<Integer> charAndOperator(NodeClass<Character> list) {
        NodeClass<Integer> listToReturn = new NodeClass<Integer>(0);
        NodeClass<Integer> pos = listToReturn;
        NodeClass<Character> p = list;
        while (p != null) {
            int x = calc(p.getValue(), p.getNext().getValue(), p.getNext().getNext().getValue());
            pos.setNext(new NodeClass<Integer>(x));
            pos = pos.getNext();
            p = p.getNext().getNext().getNext();
        }
        return listToReturn.getNext();
    }

    public static void main(String[] args) {
        NodeClass<Integer> listReturned = charAndOperator(NodeClass.buildList1());
        NodeClass<Integer> p = listReturned;
        while (p != null) {
            System.out.println(p.getValue());
            p = p.getNext();
        }
    }

}
