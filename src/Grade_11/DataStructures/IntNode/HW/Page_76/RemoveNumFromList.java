package Grade_11.DataStructures.IntNode.HW.Page_76;
import Grade_11.DataStructures.IntNode.IntNode;

//Page 76 Question 5
public class RemoveNumFromList {
    public static void removeNumFromList(IntNode list, int num) {
        IntNode p = list;
        while (p.getNext() != null) {
            if (Integer.toString(p.getNext().getValue()).contains(Integer.toString(num))) {
                p.setNext(p.getNext().getNext());
                break;
            }
            p = p.getNext();
        }
    }
}
