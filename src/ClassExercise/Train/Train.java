package ClassExercise.Train;

import java.util.Arrays;

public class Train {
    private Engine engine;
    private Carriage[] carriageArr;
    private int amountOfCarriages;

    public Train(Engine engine, int maxCarriages) {
        this.engine = engine;
        carriageArr = new Carriage[maxCarriages];
        amountOfCarriages = 0;
    }

    @Override
    public String toString() {
        return "Train{" +
                "engine=" + engine +
                ", carriageArr=" + Arrays.toString(carriageArr) +
                ", amountOfCarriages=" + amountOfCarriages +
                '}';
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Carriage[] getCarriageArr() {
        return carriageArr;
    }

    public void setCarriageArr(Carriage[] carriageArr) {
        this.carriageArr = carriageArr;
    }

    public int getAmountOfCarriages() {
        return amountOfCarriages;
    }

    public void setAmountOfCarriages(int amountOfCarriages) {
        this.amountOfCarriages = amountOfCarriages;
    }

    public boolean addCarriage(Carriage carriage) {
        if (this.amountOfCarriages < this.carriageArr.length) {
            this.carriageArr[amountOfCarriages] = carriage;
            amountOfCarriages++;
            return true;
        }
        return false;
    }

    public int maxPassengers() {
        int sum = 0;
        for (int i = 0; i < amountOfCarriages; i++) {
            sum += carriageArr[i].getMaxPassengers();
        }
        return sum;
    }

    public int averagePassengersPerCarriage() {
        int sum = 0;
        for (int i = 0; i < amountOfCarriages; i++) {
            sum += carriageArr[i].getAmountOfPassengers();
        }

        return sum / amountOfCarriages;
    }
}
