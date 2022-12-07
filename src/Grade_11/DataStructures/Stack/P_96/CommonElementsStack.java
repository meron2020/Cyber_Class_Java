package Grade_11.DataStructures.Stack.P_96;

import Grade_11.DataStructures.Stack.Stack;

public class CommonElementsStack {
    public static Stack<Integer> findCommonElements(Stack<Integer> stack1, Stack<Integer> stack2) {
        Stack<Integer> stack3 = new Stack<Integer>();
        Stack<Integer> temp = new Stack<Integer>();
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            if (stack1.top() == stack2.top()) {
                temp.push(stack1.pop());
                stack2.pop();
            }
            else if (stack1.top() > stack2.top()) {
                stack2.pop();
            }
            else if (stack1.top() < stack2.top()) {
                stack1.pop();
            }
        }

        while (!temp.isEmpty()) {
            stack3.push(temp.pop());
        }
        return stack3;
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = Stack.createSortedStack();
        Stack<Integer> stack2 = Stack.createSortedStack();
        Stack.printIntegerStack(findCommonElements(stack1, stack2));
    }
}
