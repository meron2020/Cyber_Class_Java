package Grade_11.DataStructures.Node.BookQuestions.P_105.Q59;

import Grade_11.DataStructures.Node.Node;

public class Bus {
    public int price;
    public int line;
    public Node<Station> stations;

    public int fromAToB(Station a, Station b) {
        Node<Station> end = this.stations;
        while (end != null) {
            if (end.getValue().equals(b)) {
                Node<Station> beginning = this.stations;
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
