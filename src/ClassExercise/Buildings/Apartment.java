package ClassExercise.Buildings;

public class Apartment {
    private String ownerName;
    private Room[] rooms;

    public Apartment(String ownerName, Room[] rooms) {
        this.ownerName = ownerName;
        this.rooms = rooms;
    }

    public double wholeArea() {
        double area = 0;
        for (int i = 0; i < rooms.length; i++) {
            area += rooms[i].area();
        }
        return area;
    }

    public String apartmentCategory() {
        double area = wholeArea();
        if (area > 110) {
            return "large";
        }
        else if (area > 70) {
            return "medium";
        }
        else {
            return "small";
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
