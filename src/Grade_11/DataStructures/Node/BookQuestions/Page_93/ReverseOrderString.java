package Grade_11.DataStructures.Node.BookQuestions.Page_93;

import Grade_11.DataStructures.Node.Node;
//Page 93 Question 20
public class ReverseOrderString {
    public static Node<String> reverseOrderString(Node<String> list) {
        Node<String> pos1 = list;
        Node<String> pos2 = pos1;
        while (pos2.getNext() != null) {
            pos2 = pos2.getNext();
        }
        while (pos1 != pos2) {
            Node<String> nodeToMove = pos1;
            pos1 = pos1.getNext();
            nodeToMove.setNext(pos2.getNext());
            pos2.setNext(nodeToMove);
        }

        return pos1;
    }

    public static void main(String[] args) {
        Node<String> list = Node.buildListString();
        list = ReverseOrderString.reverseOrderString(list);
        while (list != null) {
            System.out.println(list.getValue());
            list = list.getNext();
        }
    }
}
