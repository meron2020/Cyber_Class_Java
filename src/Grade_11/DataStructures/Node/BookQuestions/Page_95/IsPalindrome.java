package Grade_11.DataStructures.Node.BookQuestions.Page_95;

import Grade_11.DataStructures.NodeClass;

public class IsPalindrome {
    public static boolean isPalindrome(NodeClass<Integer> list, int num) {
        NodeClass<Integer> p = list;
        NodeClass<Integer> pos = p;
        while (p != null) {
            int[] arr = new int[num];
            int counter = 0;
            while (counter != num && pos != null) {
                arr[counter] = pos.getValue();
                pos = pos.getNext();
            }
            if (counter == num) {
                int[] newArr = new int[arr.length];
                for (int i = 0; i < arr.length; i++) {
                    newArr[arr.length - i] = arr[i];
                }
                for (int i = 0; i < arr.length; i++) {
                    if (!(newArr[i] == arr[i])) {
                        return false;
                    }
                }
                return true;
            }
            p = p.getNext();
        }
        return false;
    }
}
