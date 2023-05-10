package Grade_11.StudiesForTests.Test.DigitsToIntegers;

import Grade_11.DataStructures.NodeClass;

public class DigitsToIntegers {
    public static NodeClass<Integer> turnDigitsToIntegers(NodeClass<Integer> digits) {
        NodeClass<Integer> pos = digits;
        NodeClass<Integer> integers = new NodeClass<Integer>(1);
        int currentNum = 0;
        int exponentCounter = 0;
        while (pos != null) {
            if (pos.getValue() == -9) {
                integers.setNext(new NodeClass<>(currentNum, integers.getNext()));
                currentNum = 0;
                exponentCounter = 0;
            } else {
                currentNum += (Math.pow(10, exponentCounter) * pos.getValue());
                exponentCounter++;
            }
            pos = pos.getNext();
        }
        return integers.getNext();
    }
}
