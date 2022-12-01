package Grade_11.DataStructures.Stack.P_Q121.Q_5;


import java.util.Stack;

public class Program {
    public static boolean ordered(<Integer> stack) {
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

    public static boolean IsSort(Stack<Integer> s) {
        Stack<Integer> temp = Stack.clone(s);
        int x = temp.pop();
        while (!temp.isEmpty()) {
            if (x > s.top()) {
                return false;
            }
            x = s.pop();
        }
        return true;
    }
}
