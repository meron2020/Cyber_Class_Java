package ClassExercise.RainPeriod;

public class RainPeriod {
    private int monthNum;
    private int[] dayNum;


    public RainPeriod(int monthNum, int[] dayNum) {
        this.monthNum = monthNum;
        this.dayNum = dayNum;
    }

    public int getMonthNum() {
        return monthNum;
    }

    public void setMonthNum(int monthNum) {
        this.monthNum = monthNum;
    }

    public int[] getDayNum() {
        return dayNum;
    }

    public void setDayNum(int[] dayNum) {
        this.dayNum = dayNum;
    }

    public int amountOfRainFallen() {
        int sum = 0;
        for (int i = 0; i < dayNum.length; i++) {
            sum += dayNum[i];
        }
        return sum;
    }

    public int rainiestMonth(RainPeriod rainPeriod) {
        if (rainPeriod.amountOfRainFallen() > this.amountOfRainFallen()) {
            return rainPeriod.monthNum;
        } else if (rainPeriod.amountOfRainFallen() < this.amountOfRainFallen()) {
            return this.monthNum;
        }

        return 0;
    }


}
