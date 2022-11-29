package Grade_11.DataStructures.Node.ClassExercises.TVProg;

import Grade_11.DataStructures.NodeClass;

public class Main {
    public static NodeClass<String> programsInDay(NodeClass<TvProg> list, int day) {
        NodeClass<String> listToReturn = new NodeClass<String>("");
        NodeClass<String> p2 = listToReturn;
        NodeClass<TvProg> p = list;
        while (p != null) {
            if (p.getValue().getDay() == day) {
                p2.setNext(new NodeClass<String>(p.getValue().getName()));
                p2 = p2.getNext();
            }
            p = p.getNext();
        }
        return listToReturn.getNext();
    }
}
