import java.util.Scanner;

public class Malben {
    private int length;
    private int width;

    public Malben(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Malben() {
        width = 0;
        length = 0;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }


    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * length + 2 * width;
    }

    public boolean doesRectangleFit(Malben rectangle) {
        return rectangle.getWidth() < this.getWidth() && rectangle.getLength() < rectangle.getWidth();
    }

    public String toString() {
        return "The rectangle has a width of " + width + " and a length of " + length + ".";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle 1");
        int Rec1Length = scanner.nextInt();
        System.out.println("Enter the width of Rectangle 1");
        int Rec1Width = scanner.nextInt();
        System.out.println("Enter the length of Rectangle 2");
        int Rec2Length = scanner.nextInt();
        System.out.println("Enter the width of Rectangle 2");
        int Rec2Width = scanner.nextInt();

        Malben malben1 = new Malben(Rec1Length, Rec1Width);
        Malben malben2 = new Malben(Rec2Length, Rec2Width);

        Malben malben3 = new Malben(malben1.getLength() + malben2.length,
                Math.abs(malben1.getWidth() - malben2.getWidth()));

        System.out.println(malben1);
        System.out.println(malben2);
        System.out.println(malben3);

        System.out.println(malben1.doesRectangleFit(malben2));
        System.out.println(malben2.doesRectangleFit(malben1));
    }
}
