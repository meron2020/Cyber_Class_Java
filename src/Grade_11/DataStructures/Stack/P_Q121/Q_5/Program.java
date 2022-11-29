package Grade_11.DataStructures.Stack.P_Q121.Q_5;

import Grade_11.DataStructures.Stack.Stack;

public class Program {
    public static boolean ordered(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        boolean ordered = true;
        if (stack.isEmpty()) {
            return false;
        }
        tempStack.push(stack.pop());
        while (!stack.isEmpty() && ordered) {
            if (stack.top() > tempStack.top()) {
                ordered = false;
            } else {
                tempStack.push(stack.pop());
            }
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
        return true;
    }
}
