package Grade_11.StudiesForBagrut.Bagrut2019.Question3;

public class Flashlight {
    private String model;
    private int price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Flashlight(String model, int price) {
        this.model = model;
        this.price = price;
    }

    // O(n**3)
    public static void threeFlashLights(Flashlight[] arr, int total) {
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = i+1; k < arr.length; k++) {
                    if (arr[i].getPrice() + arr[k].getPrice() + arr[j].getPrice() == total) {
                        System.out.println(arr[i].getModel());
                        System.out.println(arr[j].getModel());
                        System.out.println(arr[k].getModel());
                        return;
                    }
                }
            }
        }
    }
}
