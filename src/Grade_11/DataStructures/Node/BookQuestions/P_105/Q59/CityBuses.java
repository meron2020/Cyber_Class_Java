package Grade_11.DataStructures.Node.BookQuestions.P_105.Q59;

import Grade_11.DataStructures.Node.Node;

public class CityBuses {
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Node<Bus> getLines() {
        return lines;
    }

    public void setLines(Node<Bus> lines) {
        this.lines = lines;
    }

    private String cityName;
    private Node<Bus> lines;
}
