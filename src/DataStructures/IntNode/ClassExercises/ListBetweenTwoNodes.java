package DataStructures.IntNode.ClassExercises;

import DataStructures.IntNode.IntNode;

import java.sql.SQLOutput;
//Page 76 Question 3
public class ListBetweenTwoNodes {
    public static void listBetweenTwoNodes(IntNode list, int pre, int post) {
        IntNode p = list;
        int counter = 0;
        while (counter != pre) {
            p = p.getNext();
            counter++;
        }
        while (counter != post) {
            System.out.println(p.getValue());
            p = p.getNext();
            counter++;
        }

    }
}
