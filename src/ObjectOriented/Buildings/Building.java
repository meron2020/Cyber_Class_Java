package ObjectOriented.Buildings;

public class Building {
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }

    private Address address;
    private Apartment[] apartments;

    public Building(Address address, Apartment[] apartments) {
        this.address = address;
        this.apartments = apartments;
    }
}
