package Grade_11.StudiesForTests.KipatBarzel;

public class KipatBarzel {
    private int num;
    private int interception;
    private int missed;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getInterception() {
        return interception;
    }

    public void setInterception(int interception) {
        this.interception = interception;
    }

    public int getMissed() {
        return missed;
    }

    public void setMissed(int missed) {
        this.missed = missed;
    }

    public int successRate() {
        return this.interception / (this.interception + this.missed) * 100;
    }
}
