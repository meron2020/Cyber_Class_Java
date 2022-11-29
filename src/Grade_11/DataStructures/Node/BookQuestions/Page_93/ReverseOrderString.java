package Grade_11.DataStructures.Node.BookQuestions.Page_93;

import Grade_11.DataStructures.NodeClass;
//Page 93 Question 20
public class ReverseOrderString {
    public static NodeClass<String> reverseOrderString(NodeClass<String> list) {
        NodeClass<String> pos1 = list;
        NodeClass<String> pos2 = pos1;
        while (pos2.getNext() != null) {
            pos2 = pos2.getNext();
        }
        while (pos1 != pos2) {
            NodeClass<String> nodeClassToMove = pos1;
            pos1 = pos1.getNext();
            nodeClassToMove.setNext(pos2.getNext());
            pos2.setNext(nodeClassToMove);
        }

        return pos1;
    }

    public static void main(String[] args) {
        NodeClass<String> list = NodeClass.buildListString();
        list = ReverseOrderString.reverseOrderString(list);
        while (list != null) {
            System.out.println(list.getValue());
            list = list.getNext();
        }
    }
}
