package Grade_11.DataStructures.IntNode.HW.Page_76;
import Grade_11.DataStructures.IntNode.IntNode;

// Page 76 Question 10
public class AscendingListFromNum {
    public static IntNode ascendingListFromNum(int beginner, int num) {
        IntNode first = new IntNode(beginner);
        IntNode p = first;
        for (int i = 1; i < num; i++) {
            p.setNext(new IntNode(beginner + i));
            p = p.getNext();
        }
        return first;
    }
}
