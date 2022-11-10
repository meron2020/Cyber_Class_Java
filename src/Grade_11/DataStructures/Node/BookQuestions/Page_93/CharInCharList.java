package Grade_11.DataStructures.Node.BookQuestions.Page_93;

import Grade_11.DataStructures.Node.Node;

import java.util.Scanner;

//Page 93 Question 15
public class CharInCharList {
    public static int charInCharList(Node<Character> list, Character character) {
        int counter = 0;
        Node<Character> p = list;
        while (p != null) {
            if (p.getValue() == character) {
                counter++;
            }
            p = p.getNext();
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the string you will enter >>");
        int length = scanner.nextInt();
        Node<Character> list = new Node<Character>('a');
        Node<Character> pos = list;
        for (int i = 0; i < length; i++) {
            System.out.println("Enter a character >>");
            Character entered = scanner.next().charAt(0);
            pos.setNext(new Node<>(entered));
            pos = pos.getNext();
        }
        list = list.getNext();
        for (int i = 65; i < 91; i++) {
            System.out.println((char) i + " >> " + charInCharList(list, (char) i));
        }
        for (int i = 97; i < 123; i++) {
            System.out.println((char) i + " >> " + charInCharList(list, (char) i));
        }
    }
}
