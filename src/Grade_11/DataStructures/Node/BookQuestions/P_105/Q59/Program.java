package Grade_11.DataStructures.Node.BookQuestions.P_105.Q59;

import Grade_11.DataStructures.Node.Node;

public class Program {
    public static int lowestPriceTravel(CityBuses city, Station origin, Station destination) {
        Node<Bus> currentBus = city.getLines();
        while (currentBus != null) {
            if (currentBus.getValue().fromAToB(origin, destination) != -1) {
                int lowestPriceTravel = currentBus.getValue().fromAToB(origin,destination);
                Node<Bus> cheapestBus = currentBus;
                Node<Bus> p = cheapestBus;
                while (p != null) {
                    if (p.getValue().fromAToB(origin, destination) < lowestPriceTravel) {
                        lowestPriceTravel = p.getValue().fromAToB(origin, destination);
                        cheapestBus = p;
                        p = p.getNext();
                    }
                }
                return cheapestBus.getValue().line;
            }
            currentBus = currentBus.getNext();

        }
        return -1;
    }
}
