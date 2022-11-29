package Grade_11.DataStructures.Node.BookQuestions.Page_94;

import Grade_11.DataStructures.NodeClass;

//Page 94 Question 24
public class FirstPlaceOfNumber {
    public static NodeClass<Integer> firstPlaceOfNumber(NodeClass<Integer> list, int num) {
        NodeClass<Integer> p = list;
        while (p != null) {
            if (p.getValue() == num) {
                return p;
            }
            p = p.getNext();
        }
        return null;
    }
}
