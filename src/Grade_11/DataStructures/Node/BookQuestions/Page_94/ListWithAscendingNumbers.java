package Grade_11.DataStructures.Node.BookQuestions.Page_94;

import Grade_11.DataStructures.Node.Node;

//Page 94 Question 25
public class ListWithAscendingNumbers {
    public static boolean listWithAscendingNumbers(Node<Integer> lis, int num) {
        Node<Integer> p = lis;
        int counter = 1;
        while (p.getNext() != null) {
            if (p.getNext().getValue() == p.getValue() + 1) {
                counter++;
            } else {
                if (counter >= num) {
                    return true;
                } else {
                    counter = 1;
                }
            }
            p = p.getNext();
        }
        return false;
    }
}
