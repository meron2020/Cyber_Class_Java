package Grade_11.DataStructures.Node.BookQuestions.Page_99.Q47;

import Grade_11.DataStructures.NodeClass;

public class Q47 {
    public static int mostThrownNumber(NodeClass<Integer> list) {
        int[] throwOptions = new int[13];
        NodeClass<Integer> p = list;
        while (p != null) {
            throwOptions[p.getValue()]++;
            p = p.getNext();
        }

        int maxNum = throwOptions[0];
        for (int i = 0; i < throwOptions.length; i++) {
            if (throwOptions[i] > maxNum) {
                throwOptions[i] = maxNum;
            }
        }
        return maxNum;
    }
}
