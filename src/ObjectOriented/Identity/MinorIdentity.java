package ObjectOriented.Identity;

import java.util.Date;

public class MinorIdentity {
    public int getIdNumber() {
        return idNumber;
    }

    public MinorIdentity(int idNumber, String firstName, String lastName, Date date, String countryOfBirth, String nationality) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
        this.countryOfBirth = countryOfBirth;
        this.nationality = nationality;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    private int idNumber;
    private String firstName;
    private String lastName;
    private Date date;
    private String countryOfBirth;
    private String nationality;


}
