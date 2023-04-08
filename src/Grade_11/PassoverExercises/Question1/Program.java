package Grade_11.PassoverExercises.Question1;

public class Program {
    public static void program(String[] nameArr) {
        for (int i = 0; i < nameArr.length; i++) {
            boolean singular = true;
            String name = nameArr[i];
            int j = i+1;
            while (singular && (j < nameArr.length)) {
                if (nameArr[j].equals(name)) {
                    singular = false;
                }
                else {
                    j++;
                }
            }
            if (!singular) {
                int counter = 1;
                for (j = i; j < nameArr.length; j++) {
                    if (nameArr[j].equals(name)) {
                        nameArr[j] = name + counter;
                        counter++;
                    }
                }
            }
        }
        for (int i = 0; i < nameArr.length; i++) {
            System.out.println(nameArr[i]);
        }
    }

    public static void main(String[] args) {
        String[] names = {"yoav", "yair", "yoav", "yoav", "tzur", "tzur"};
        program(names);
    }
}