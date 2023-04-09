package Grade_11.DataStructures.Node.BookQuestions.P_105.Q59;

public class Station {
    private String street;
    private int num;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Station(String street, int num) {
        this.street = street;
        this.num = num;
    }

    public boolean equals(Station s) {
        return this.street.equals(s.street) && this.num == s.num;
    }
}
