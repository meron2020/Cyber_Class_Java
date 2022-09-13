package ClassExercise.Auction;

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

    public static double maxOffer(double[] offers) {
        double maxOffer = 0;
        for (int i = 0; i < offers.length; i++) {
            if (offers[i] > maxOffer) {
                maxOffer = offers[i];
            }
        }
        return maxOffer;
    }

    public static int maxOfferCount(double[] offers) {
        double offerAmount = 0;
        double maxOffer = maxOffer(offers);
        for (int i = 0; i < offers.length; i++) {
            if (offers[i] == maxOffer) {
                offerAmount++;
            }
        }
        return 0;

    }

}
