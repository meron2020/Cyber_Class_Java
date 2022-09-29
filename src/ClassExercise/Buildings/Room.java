package ClassExercise.Buildings;

public class Room {
    private String roomType;
    private double length;
    private double width;

    public Room(String roomType, double width, double length) {
        this.roomType = roomType;
        this.length = length;
        this.width = width;
    }

    public Room(Room room) {
        this.roomType = room.roomType;
        this.length = room.length;
        this.width = room.width;
    }

    public double area() {
        return length * width;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
