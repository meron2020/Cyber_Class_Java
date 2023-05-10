package Grade_11.StudiesForTests.Test.Distance;

import Grade_11.DataStructures.NodeClass;

public class Distance {
    // The smallest distance being zero is when the list is only comprised of the wanted number.
    public static int findDistance(NodeClass<Integer> list, int num) {
        int distanceFromBeginning = 0;
        int distanceFromEnd = 0;
        NodeClass<Integer> p = list;
        while (p.getValue() != num) {
            distanceFromBeginning++;
            p = p.getNext();
        }
        while (p != null) {
            if (p.getValue() == num) {
                distanceFromEnd = 0;
            } else {
                distanceFromEnd++;
            }
            p = p.getNext();
        }
        return distanceFromBeginning + distanceFromEnd;
    }

    public static int findSmallestDistance(NodeClass<Integer> list) {
        int numWithSmallestDistance = list.getValue();
        int smallest = findDistance(list, numWithSmallestDistance);
        NodeClass<Integer> p = list;
        while (p != null) {
            int currentDistance = findDistance(list, p.getValue());
            if (currentDistance < smallest) {
                smallest = currentDistance;
                numWithSmallestDistance = p.getValue();
            }
            p = p.getNext();
        }
        return numWithSmallestDistance;
    }
}
