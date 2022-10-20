package ObjectOriented.Delicacy;

public class SuperDelicacy {

    private String superMarketName;
    private Delicacy[] delicacies;
    private int delicacyNumber;

    public SuperDelicacy(String superMarketName) {
        this.superMarketName = superMarketName;
        this.delicacies = new Delicacy[1000];
    }

    public void addDelicacy(Delicacy delicacy) {
        if (this.delicacyNumber < 1000) {
            this.delicacies[this.delicacyNumber] = delicacy;
            this.delicacyNumber++;
        }
    }

    public double getDelicacyPriceByName(String name) {
        for (int i = 0; i < this.delicacyNumber; i++) {
            if (this.delicacies[i].getName().equals(name)) {
                return this.delicacies[i].getPrice();
            }
        }
        return 0;
    }

    public String[] sharedDelicacies(SuperDelicacy otherSuperDelicacy) {
        String[] delicacies = new String[this.delicacyNumber];
        int numberOfDelicacies = 0;
        for (int i = 0; i < this.delicacyNumber; i++) {
            if (otherSuperDelicacy.isDelicacyInStore(this.delicacies[i].getName()) > 0) {
                delicacies[numberOfDelicacies] = this.delicacies[i].getName();
            }
        }

        return delicacies;

    }

    public double isDelicacyInStore(String name) {
        for (int i = 0; i < this.delicacyNumber; i++) {
            if (this.delicacies[i].getName().equals(name)) {
                return delicacies[i].getPrice();
            }
        }
        return 0;

    }

    public boolean isDelicacyInList(String name, String[] list) {
        for (int i = 0; i < list.length; i++) {
            if (this.delicacies[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public int howManyDelicaciesByCompany(String companyName) {
        String[] delicacyNames = new String[this.delicacyNumber];
        int numberOfDelicacies = 0;
        for (int i = 0; i < this.delicacyNumber; i++) {
            Delicacy delicacy = this.delicacies[i];
            if (delicacy.getCompanyName().equals(companyName)) {
                if (!this.isDelicacyInList(delicacy.getName(), delicacyNames)) {
                    delicacyNames[numberOfDelicacies] = delicacy.getName();
                    numberOfDelicacies++;
                }
            }
        }
        return numberOfDelicacies;
    }

    public String[] cheapestPriceToAmountDelicacy() {
        double cheapestPriceToAmount = this.delicacies[0].getPriceToAmount();
        Delicacy cheapestDelicacy = this.delicacies[0];

        for (int i = 0; i < this.delicacyNumber; i++) {
            Delicacy delicacy = this.delicacies[i];
            if (delicacy.getPriceToAmount() < cheapestPriceToAmount) {
                cheapestPriceToAmount = delicacy.getPriceToAmount();
                cheapestDelicacy = delicacy;
            }
        }

        String[] listToReturn = new String[2];
        listToReturn[0] = cheapestDelicacy.getName();
        listToReturn[1] = cheapestDelicacy.getCompanyName();

        return listToReturn;
    }

    public String getSuperMarketName() {
        return superMarketName;
    }

    public void setSuperMarketName(String superMarketName) {
        this.superMarketName = superMarketName;
    }

    public Delicacy[] getDelicacies() {
        return delicacies;
    }

    public void setDelicacies(Delicacy[] delicacies) {
        this.delicacies = delicacies;
    }

    public int getDelicacyNumber() {
        return delicacyNumber;
    }

    public void setDelicacyNumber(int delicacyNumber) {
        this.delicacyNumber = delicacyNumber;
    }


}
