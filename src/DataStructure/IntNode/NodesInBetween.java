package DataStructure.IntNode;

public class NodesInBetween {
    public static void nodesInBetween(IntNode firstInList, int firstNum, int lastNum) {
        IntNode p = firstInList;
        for (int i = 0; i < firstNum; i++) {
            p = p.getNext();
        }

        for (int i = firstNum; i < lastNum; i++) {
            System.out.println(p.getValue());
            p = p.getNext();
        }
    }
}
