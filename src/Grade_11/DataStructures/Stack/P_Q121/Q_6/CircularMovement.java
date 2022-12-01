package Grade_11.DataStructures.Stack.P_Q121.Q_6;

import Grade_11.DataStructures.Stack.P_Q121.Stack;

public class CircularMovement {
    public static Stack<Integer> moveTopToBottom(Stack<Integer> stack) {
        int top = stack.pop();
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }

        stack.push(top);
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
        return stack;
    }
}
