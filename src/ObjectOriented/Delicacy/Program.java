package ObjectOriented.Delicacy;

import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);

    public static void inputDelicacies(SuperDelicacy superDelicacy) {
        while (true) {
            System.out.println("Would you like to continue? ");
            String continueInput = scanner.next();
            if (!continueInput.equals("the end")) {
                System.out.println("Enter name of the delicacy: ");
                String name = scanner.next();
                System.out.println("Enter company name: ");
                String companyName = scanner.next();
                System.out.println("Enter main flavor: ");
                String mainFlavor = scanner.next();
                System.out.println("Enter volume: ");
                int amount = scanner.nextInt();
                System.out.println("Enter price: ");
                double price = scanner.nextDouble();

                Delicacy delicacy = new Delicacy(name, companyName, mainFlavor, amount, price);
                superDelicacy.addDelicacy(delicacy);
                continue;
            }
            break;
        }
    }

    public static String cheaperStore(SuperDelicacy delicacy1, SuperDelicacy delicacy2) {
        String[] delicacies = delicacy1.sharedDelicacies(delicacy2);
        double delicacy1Sum = 0;
        double delicacy2Sum = 0;
        for (int i = 0; i < delicacies.length; i++) {
            delicacy1Sum += delicacy1.getDelicacyPriceByName(delicacies[i]);
            delicacy2Sum += delicacy2.getDelicacyPriceByName(delicacies[i]);
        }

        if (delicacy1Sum >= delicacy2Sum) {
            return delicacy1.getSuperMarketName();
        }
        return delicacy2.getSuperMarketName();
    }

    public static void main(String[] args) {
        SuperDelicacy superDelicacy1 = new SuperDelicacy("Store 1");
        SuperDelicacy superDelicacy2 = new SuperDelicacy("Store 2");
        Program.inputDelicacies(superDelicacy1);
        Program.inputDelicacies(superDelicacy2);
    }
}
