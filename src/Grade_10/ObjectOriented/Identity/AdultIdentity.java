package Grade_10.ObjectOriented.Identity;

import java.util.Date;
import java.util.Scanner;

public class AdultIdentity {
    public AdultIdentity(int idNumber, String firstName, String lastName, Date dateOfBirth, String countryOfBirth) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.countryOfBirth = countryOfBirth;
    }

    private int idNumber;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String countryOfBirth;
    private MinorIdentity[] childIdentities;

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public MinorIdentity[] getChildIdentities() {
        return childIdentities;
    }

    public void setChildIdentities(MinorIdentity[] childIdentities) {
        this.childIdentities = childIdentities;
    }


    public void addChild(MinorIdentity child) {
        MinorIdentity[] newChildIdentities = new MinorIdentity[childIdentities.length + 1];
        for (int i = 0; i < this.childIdentities.length; i++) {
            this.childIdentities[i] = newChildIdentities[i];
        }
        newChildIdentities[childIdentities.length] = child;
    }

    public void removeChildThatIsAdult(MinorIdentity child) {
        MinorIdentity[] newChildIdentities = new MinorIdentity[childIdentities.length - 1];
        int indexToFill = 0;
        for (int i = 0; i < this.childIdentities.length; i++) {
            if (this.childIdentities[i].equals(child)) {
                indexToFill = i;
            } else if (i == childIdentities.length - 1) {
                newChildIdentities[indexToFill] = childIdentities[i];
            }
            else {
                newChildIdentities[i] = childIdentities[i];
            }
        }
        this.childIdentities = newChildIdentities;
    }


    public int numberOfSharedChildren(AdultIdentity adult1) {
        int sharedChildCount = 0;
        for (int i = 0; i < this.childIdentities.length; i++) {
            for (int j = 0; j < adult1.childIdentities.length; j++) {
                if (this.childIdentities[i].equals(adult1.childIdentities[j])) {
                    sharedChildCount++;
                }
            }
        }
        return sharedChildCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MinorIdentity[] children = new MinorIdentity[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter ID >>");
            int childId = scanner.nextInt();
            System.out.println("Enter first name >>");
            String firstName = scanner.next();
            System.out.println("Enter last name >>");
            String lastName = scanner.next();
            Date date = new Date(2011, 2, 1);
            String countryOfBirth = "Israel";
            String nationality = "Jewish";
            children[i] = new MinorIdentity(childId, firstName, lastName, date, countryOfBirth, nationality);
        }
        AdultIdentity[] adults = new AdultIdentity[5];
        for (int i = 0; i < adults.length; i++) {
            System.out.println("Enter ID >>");
            int childId = scanner.nextInt();
            System.out.println("Enter first name >>");
            String firstName = scanner.next();
            System.out.println("Enter last name >>");
            String lastName = scanner.next();
            Date date = new Date(2011, 2, 1);
            String countryOfBirth = "Israel";
            adults[i] = new AdultIdentity(childId, firstName, lastName, date, countryOfBirth);
        }

        for (int i = 0; i < adults.length; i++) {
            for (int j = 0; j<2; j++) {
                adults[i].addChild(children[i* 2 + j]);
            }
        }

        for (int i = 0; i < adults.length - 1; i++) {
            for (int j = i + 1; j < adults.length; j++) {
                System.out.println(adults[i].numberOfSharedChildren(adults[j]));
            }
        }

    }
}
