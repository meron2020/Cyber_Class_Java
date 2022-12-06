package Grade_11.DataStructures.Stack.P_96;

import Grade_11.DataStructures.Stack.Stack;

import java.util.Scanner;

//Function that gets an ordered stack (ascending) as a parameter and an integer.
// The function adds the number so that the stack is returned ordered
//Runtime is O(n**2)
public class OrderedStack {
    public static void insertToSortedStack(Stack<Integer> orderedStack, int numToAdd) {
        Stack<Integer> tempStack = new Stack<>();
        while (!orderedStack.isEmpty() && orderedStack.top() < numToAdd) {
            tempStack.push(orderedStack.pop());
        }
        orderedStack.push(numToAdd);
        while (!tempStack.isEmpty()) {
            orderedStack.push(tempStack.pop());
        }
    }

    public static Stack<Integer> createSortedStack() {
        Scanner reader = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int num = reader.nextInt();
        while (num != -999) {
            insertToSortedStack(stack, num);
            num = reader.nextInt();
        }
        return stack;
    }
}
