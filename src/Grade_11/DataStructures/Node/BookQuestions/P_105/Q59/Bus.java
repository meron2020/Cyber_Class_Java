package Grade_11.DataStructures.Node.BookQuestions.P_105.Q59;

import Grade_11.DataStructures.NodeClass;

public class Bus {
    public int price;
    public int line;
    public NodeClass<Station> stations;

    public int fromAToB(Station a, Station b) {
        NodeClass<Station> end = this.stations;
        while (end != null) {
            if (end.getValue().equals(b)) {
                NodeClass<Station> beginning = this.stations;
                int stationCounter = 1;
                while (beginning != end) {
                    stationCounter++;
                    beginning = beginning.getNext();
                }
                return stationCounter * this.price;
            }
            end = end.getNext();
        }
        return -1;

    }
}
