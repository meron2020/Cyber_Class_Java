package Grade_11.DataStructures.BinNode;

public class PrintAllOnLevel {
    public static void printLevel(BinNode<Integer> t, int level) {
        if (t != null) {
            if (level == 0) {
                System.out.println(t.getValue());
            } else {
                printLevel(t.getLeft(), level - 1);
                printLevel(t.getRight(), level - 1);
            }
        }
    }
}
