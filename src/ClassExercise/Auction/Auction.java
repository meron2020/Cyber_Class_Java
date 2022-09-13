package ClassExercise.Auction;

import java.util.Arrays;

public class Auction {

    private String title;
    private double[] offers = new double[50];
    public Auction(String title, double[] offers) {
        this.title = title;
        this.offers = offers;
    }
    public String getTitle() {
        return title;
    }

    public double[] getOffers() {
        return offers;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOffers(double[] offers) {
        this.offers = offers;
    }

    public  double maxOffer() {
        double maxOffer = 0;
        for (int i = 0; i < offers.length; i++) {
            if (offers[i] > maxOffer) {
                maxOffer = offers[i];
            }
        }
        return maxOffer;
    }

    public int maxOfferCount() {
        int offerAmount = 0;
        double maxOffer = maxOffer();
        for (int i = 0; i < offers.length; i++) {
            if (offers[i] == maxOffer) {
                offerAmount++;
            }
        }
        return offerAmount;

    }

    public int[] serialArray() {
        double maxOffer = maxOffer();
        int[] serialArray = new int[maxOfferCount()];
        int counter = 0;
        for (int i = 0; i < offers.length; i++) {
            if (offers[i] == maxOffer) {
                serialArray[counter] = i;
                counter++;
            }
        }
        return serialArray;
    }

    public String toString() {
        return "This Auction object has the name " + title + " and the following offers \n " + Arrays.toString(offers);
    }
}
