package DataStructures.Node.BookQuestions.Page_93;

import DataStructures.Node.Node;

import java.util.Objects;
import java.util.Scanner;

//Page 93 Question 19
public class ReverseStringList {
    public static Node<String> reverseStringList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string >> ");
        Node<String> listToReturn = new Node<String>(scanner.next());
        while (true) {
            System.out.println("Enter a string >> ");
            String input = scanner.next();
            if (Objects.equals(input, "@")) {
                return listToReturn;
            }
            listToReturn = new Node<String>(input, listToReturn);
        }
    }

    public static void main(String[] args) {
        reverseStringList();
    }
}
