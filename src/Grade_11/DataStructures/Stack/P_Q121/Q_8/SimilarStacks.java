package Grade_11.DataStructures.Stack.P_Q121.Q_8;

import Grade_11.DataStructures.Stack.P_Q121.Stack;

public class SimilarStacks {
    public static boolean areSimilar(Stack<Integer> stack1, Stack<Integer> stack2) {
        boolean same = true;
        Stack<Integer> temp1 = new Stack<>();
        Stack<Integer> temp2 = new Stack<>();

        if (temp1.isEmpty()) {
            return temp2.isEmpty();
        }
        while (!stack1.isEmpty() && same) {
            boolean foundSame = false;
            while (!stack2.isEmpty() && !foundSame) {
                if (stack2.top() == stack1.top()) {
                    foundSame = true;
                } else {
                    temp2.push(stack2.pop());
                }
            }
            while (!temp2.isEmpty()) {
                stack2.push(temp2.pop());
            }
            if (!foundSame) {
                same = false;
            }
            else {
                stack1.push(stack1.pop());
            }
        }
        while (!temp1.isEmpty()) {
            stack2.push(temp1.pop());
        }
        return same;
    }
}
