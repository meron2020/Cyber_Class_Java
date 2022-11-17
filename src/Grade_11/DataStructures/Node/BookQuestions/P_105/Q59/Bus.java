package Grade_11.DataStructures.Node.BookQuestions.P_105.Q59;

import Grade_11.DataStructures.Node.Node;

public class Bus {
    public int num;
    public String line;
    public Node<Station> stations;

    public int fromAToB(Station a, Station b) {
        Node<Station> end = this.stations;
        while (end != null) {
            if (end.getValue().equals(b)) {
                Node<Station> beginning = this.stations;
                while (beginning != end) {

                }
            }
            end = end.getNext();
        }

    }
}
