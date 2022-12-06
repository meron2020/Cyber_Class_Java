package Grade_11.DataStructures.Stack.P_96;

import Grade_11.DataStructures.Stack.Stack;

public class MergeSortedStack {
    public static Stack<Integer> mergeSortedStacks(Stack<Integer> stack1, Stack<Integer> stack2) {
        Stack<Integer> stackToReturn = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            if (stack1.top() < stack2.top()) {
                tempStack.push(stack1.pop());
            } else if (stack1.top() > stack2.top()) {
                tempStack.push(stack2.pop());
            } else {
                tempStack.push(stack1.pop());
                tempStack.push(stack2.pop());
            }
        }
        if (stack1.isEmpty()) {
            while (!stack2.isEmpty()) {
                tempStack.push(stack2.pop());
            }
        }
        else {
            while (!stack1.isEmpty()) {
                tempStack.push(stack1.pop());
            }
        }
        while (!tempStack.isEmpty()) {
            stackToReturn.push(tempStack.pop());
        }
        return stackToReturn;
    }
}
