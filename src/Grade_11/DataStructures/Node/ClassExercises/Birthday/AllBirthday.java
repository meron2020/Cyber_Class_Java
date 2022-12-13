package Grade_11.DataStructures.Node.ClassExercises.Birthday;


import Grade_11.DataStructures.NodeClass;
import org.w3c.dom.Node;

public class AllBirthday {
    private NodeClass<Birthday>[] arr;
    public AllBirthday() {
        this.arr = new NodeClass[13];
    }
    public void addBirthday(int mon, String name, int day) {
        NodeClass<Birthday> pos = new NodeClass<Birthday>(new Birthday(name, day), arr[mon]);
        arr[mon] = pos;
    }

    public NodeClass<Birthday> removeBirthday(int mon, String name, int day) {
        Birthday birthdayToRemove = new Birthday(name, day);
        NodeClass<Birthday> list = this.arr[mon];
        NodeClass<Birthday> p = new NodeClass<Birthday>(birthdayToRemove, list);
        list = p;
        while (p.getNext() != null) {
            if (p.getNext().getValue().same(birthdayToRemove)) {
                p.setNext(p.getNext().getNext());
                return list.getNext();
            }
            p = p.getNext();
        }
        return null;
    }
}
