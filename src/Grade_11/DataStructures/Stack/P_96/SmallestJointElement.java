package Grade_11.DataStructures.Stack.P_96;

import Grade_11.DataStructures.Stack.Stack;

public class SmallestJointElement {
    public static Integer findSmallestJointElement(Stack<Integer> stack1, Stack<Integer> stack2) {
        Stack<Integer> tempStack1 = new Stack<Integer>();
        Stack<Integer> tempStack2 = new Stack<Integer>();
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            if (stack1.top() == stack2.top()) {
                return stack1.top();
            }
            else if (stack1.top() > stack2.top()) {
                tempStack2.push(stack2.pop());
            }
            else {
                tempStack1.push(stack1.pop());
            }
        }
        while (!tempStack1.isEmpty()) {
            stack1.push(tempStack1.pop());
        }
        while (!tempStack2.isEmpty()) {
            stack2.push(tempStack2.pop());
        }
        return -999;
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = Stack.createSortedStack();
        Stack<Integer> stack2 = Stack.createSortedStack();
        System.out.println(findSmallestJointElement(stack1, stack2));
    }
}
