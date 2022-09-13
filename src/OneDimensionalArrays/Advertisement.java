package OneDimensionalArrays;

import java.util.Objects;

public class Advertisement {
    private String name;
    private String companyName;
    private int adLength;
    static int secondPrice = 800;

    Advertisement(String name, String companyName, int adLength) {
        this.setName(name);
        this.setCompanyName(companyName);
        this.setAdLength(adLength);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getAdLength() {
        return adLength;
    }

    public void setAdLength(int adLength) {
        this.adLength = adLength;
    }

    public void represent() {
        System.out.printf("The ad %s is owned by %s, is %x seconds long and costs %x dollars%n",
                this.name, this.companyName, this.adLength, this.adLength * Advertisement.secondPrice);
    }

    public static int companyTotalAdLength(Advertisement[] ads, String companyName) {
        int secondsCounter = 0;
        for (Advertisement advertisement : ads) {
            if (Objects.equals(advertisement.getCompanyName(), companyName)) {
                secondsCounter += advertisement.getAdLength();
            }
        }
        return secondsCounter;
    }

    public static void main(String[] args) {
        String[] companyNames = {"Google", "Amdocs", "McDonalds", "Meta"};
        Advertisement[] advertisements = new Advertisement[53];
        for (int i = 0; i < 53; i++) {
            String companyName = companyNames[(int) (Math.random() * companyNames.length)];
            int adLength = (int) (Math.random() * 100);
            advertisements[i] = new Advertisement("ad", companyName, adLength);
        }
        int totalPrice = 0;
        for (Advertisement ad : advertisements) {
            int minutes = ad.getAdLength() / 60;
            int seconds = ad.getAdLength() % 60;
            System.out.println("minutes >>" + minutes);
            System.out.println("seconds >>" + seconds);
            int price = ad.getAdLength() * Advertisement.secondPrice;
            System.out.println(price);
            totalPrice += price;
        }
        System.out.println(totalPrice);
        String companyWithMostAds = "";

        for (String company : companyNames) {
            if (Advertisement.companyTotalAdLength(advertisements, company) >
                    Advertisement.companyTotalAdLength(advertisements, companyWithMostAds)) {
                companyWithMostAds = company;
            }
        }
        System.out.println(companyWithMostAds);
    }

}
