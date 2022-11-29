package Grade_11.DataStructures.Node.BookQuestions.P_105.Q59;

import Grade_11.DataStructures.NodeClass;

public class CityBuses {
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public NodeClass<Bus> getLines() {
        return lines;
    }

    public void setLines(NodeClass<Bus> lines) {
        this.lines = lines;
    }

    private String cityName;
    private NodeClass<Bus> lines;
}
