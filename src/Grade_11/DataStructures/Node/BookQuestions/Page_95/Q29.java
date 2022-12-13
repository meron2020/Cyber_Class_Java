package Grade_11.DataStructures.Node.BookQuestions.Page_95;

import Grade_11.DataStructures.NodeClass;

public class Q29 {
    public int numOfConsistentSeries(NodeClass<Integer> list) {
        int counter = 0;
        NodeClass<Integer> p = list;
        NodeClass<Integer> x = p;
        while (p != null) {
            boolean consistent = true;
            while (x.getNext() != null || consistent)
                if (x.getNext().getValue() == -999) {
                    if (consistent) {
                        counter++;
                    }
                    consistent = false;
                } else if (!(x.getValue() + 1 == x.getNext().getValue())) {
                    consistent = false;
                } else {
                    x = x.getNext();
                }
            if (x.getNext() == null) {
                return counter;
            }
            p = x.getNext().getNext();
        }

        return counter;
    }

}
