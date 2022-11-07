package DataStructures.IntNode.HW.Page_76;

import DataStructures.IntNode.IntNode;

import java.util.Scanner;

// Page 76 Question 11
public class ReverseOrder {
    public static IntNode getReverseOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number >> ");
        int input = scanner.nextInt();
        IntNode first = new IntNode(input);
        while (true) {
            System.out.println("Enter a number >> ");
            input = scanner.nextInt();
            if (input == -999) {
                break;
            }
            first = new IntNode(input, first);
        }
        return first;
    }
}
