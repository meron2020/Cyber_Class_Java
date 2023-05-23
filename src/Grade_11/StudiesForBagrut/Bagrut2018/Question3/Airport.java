package Grade_11.StudiesForBagrut.Bagrut2018.Question3;

public class Airport {
    Flight[] flights;

    public boolean isFly() {
        for (int i = 0; i < this.flights.length; i++) {
            if (this.flights[i].getName().equals("Sky")) {
                return true;
            }
        }
        return false;
    }
}
