package Grade_11.DataStructures.IntNode.HW.Page_76;
import Grade_11.DataStructures.IntNode.IntNode;

// Question 8
public class InOrder {
    public static boolean isInOrder(IntNode list) {
        while (list.getNext() != null) {
            if (list.getNext().getValue() < list.getValue()) {
                return false;
            }
            list = list.getNext();
        }
        return true;
    }
}
