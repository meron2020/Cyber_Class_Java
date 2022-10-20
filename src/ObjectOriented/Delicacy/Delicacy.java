package ObjectOriented.Delicacy;

public class Delicacy {
    private String name;
    private String companyName;
    private String mainFlavor;
    private int amount;
    private double price;

    @Override
    public String toString() {
        return "This delicacy is " + name + " and is made by " + companyName + ". Its main flavor is " + mainFlavor
                +  " and each is " + amount +  " milliliters. It costs " + price;
    }

    public Delicacy(String name, String companyName, String mainFlavor, int amount, double price) {
        this.name = name;
        this.companyName = companyName;
        this.mainFlavor = mainFlavor;
        this.amount = amount;
        this.price = price;
    }

    public double getPriceToAmount() {
        return this.price / this.amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getMainFlavor() {
        return mainFlavor;
    }

    public void setMainFlavor(String mainFlavor) {
        this.mainFlavor = mainFlavor;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
