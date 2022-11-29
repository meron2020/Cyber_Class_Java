package Grade_11.DataStructures.Node.BookQuestions.Page_93;

import Grade_11.DataStructures.NodeClass;

import java.util.Objects;
import java.util.Scanner;

//Page 93 Question 19
public class ReverseStringList {
    public static NodeClass<String> reverseStringList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string >> ");
        NodeClass<String> listToReturn = new NodeClass<String>(scanner.next());
        while (true) {
            System.out.println("Enter a string >> ");
            String input = scanner.next();
            if (Objects.equals(input, "@")) {
                return listToReturn;
            }
            listToReturn = new NodeClass<String>(input, listToReturn);
        }
    }

    public static void main(String[] args) {
        reverseStringList();
    }
}
