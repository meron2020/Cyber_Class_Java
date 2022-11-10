package Grade_10.ObjectOriented.Driver;

public class Driver {
    private String name;
    private double age;
    private double yearsWithLicense;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setYearsWithLicense(double yearsWithLicense) {
        this.yearsWithLicense = yearsWithLicense;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getAge() {
        return age;
    }

    public double getYearsWithLicense() {
        return yearsWithLicense;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    private double maxSpeed;

    public boolean checkIfSpeedLimit() {
        if (this.getAge() < 24 && this.getYearsWithLicense() < 2) {
            this.setMaxSpeed(this.getMaxSpeed() - 10);
            return true;
        }
        return false;
    }

}

