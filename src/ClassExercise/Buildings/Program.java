package ClassExercise.Buildings;

public class Program {

    public static int getApartmentsInCategory(Building building, String category) {
        int apartments = 0;
        for (int j = 0; j < building.getApartments().length; j++) {
            if (building.getApartments()[j].apartmentCategory().equals(category)) {
                apartments++;
            }
        }
        return apartments;
    }

    public void printAllApartmentOwners(Building building, String category) {
        for (int i = 0; i < building.getApartments().length; i++) {
            if (building.getApartments()[i].apartmentCategory().equals(category)) {
                System.out.println(building.getApartments()[i].getOwnerName());
            }
        }
    }

    public void biggestApartments(Building[] buildings) {
        int maxLargeApartments = 0;
        for (int i = 0; i < buildings.length; i++) {
            int largeApartments = getApartmentsInCategory(buildings[i], "large");
            if (largeApartments > maxLargeApartments) {
                maxLargeApartments = largeApartments;
            }
        }

        for (int i = 0; i < buildings.length; i++) {
            int largeApartments = getApartmentsInCategory(buildings[i], "large");
            if (largeApartments == maxLargeApartments) {
                System.out.println(buildings[i].getAddress());
                printAllApartmentOwners(buildings[i], "large");
            }
        }
    }
}

