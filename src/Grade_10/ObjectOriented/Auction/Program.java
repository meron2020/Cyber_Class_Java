package Grade_10.ObjectOriented.Auction;

import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);
    public static Auction createAuction() {
        double[] offersArray = new double[50];
        for (int i = 0; i < offersArray.length; i++) {
            offersArray[i] = Math.random() * 100;
        }
        return new Auction(scanner.next(), offersArray);

    }

    public static double returnHighestOffer(Auction auction) {
        int[] serialArray = auction.serialArray();
        double[] offersArray = auction.getOffers();
        while (serialArray.length > 1) {
            for (int i = 0; i < serialArray.length; i++) {
                while (offersArray[serialArray[i]] < auction.maxOffer()) {
                    offersArray[serialArray[i]] = Math.random() * 200;
                }
            }
            serialArray = auction.serialArray();
        }

        return offersArray[serialArray[0]];
    }

    public static void main(String[] args) {
        Auction[] auctions = new Auction[10];
        double totalHighestOffers = 0;
        for (int i = 0; i < auctions.length; i++) {
            auctions[i] = createAuction();
            double highestOffer = Program.returnHighestOffer(auctions[i]);
            System.out.println("Auction " + i+1 + ": " + auctions[i].getTitle() + " - " + highestOffer + "\n");
            totalHighestOffers += highestOffer;
        }
        double average = totalHighestOffers / auctions.length;

        for (int i = 0; i < auctions.length; i++) {
            if (auctions[i].maxOffer() > average) {
                System.out.println("Auction: " + auctions[i].getTitle() + " - " + auctions[i].maxOffer() + "\n");
            }
        }
    }
}
