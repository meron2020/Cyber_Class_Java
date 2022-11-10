package Grade_11.DataStructures.IntNode.ClassExercises.TeacherAssignments;

import Grade_11.DataStructures.IntNode.IntNode;

public class DeleteAllEvenNumbers {
    public static IntNode removeEvenNumbers(IntNode list) {
        // ביטול חוליית דמי
        IntNode pos = new IntNode(5, list);
        list = pos;
        while (pos.getNext() != null) {
            if (pos.getNext().getValue() % 2 == 0) {
                pos.setNext(pos.getNext().getNext());
            }
            else {
                pos = pos.getNext();
            }
        }
        return list.getNext();
    }
}
