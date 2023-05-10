package Grade_11.StudiesForTests.Test.Practice;

import Grade_11.DataStructures.NodeClass;

public class Program {
    public static boolean wantedPractice(NodeClass<Practice> practiceList, String practice) {
        NodeClass<Practice> p = practiceList;

        while (p != null) {
            if (p.getValue().getName() == practice) {
                if (!p.getValue().listFull()) {
                    return false;
                }
            }
            p = p.getNext();
        }
        return true;
    }

    public static boolean addPractice(NodeClass<Practice> practiceList, String name, int day,
                                      int month, int maxParticipants) {
        // Runs in O(n**2) because there is a while loop in the  wantedPractice function that runs a while
        // loop in the listFull() function every iteration so the runtime is exponential meaning O(n**2).
        if (wantedPractice(practiceList, name)) {
            practiceList = new NodeClass<Practice>(new Practice(name, day, month, maxParticipants), practiceList);
            return true;
        }
        return false;
    }
}
