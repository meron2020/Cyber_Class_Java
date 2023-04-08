package Grade_11.PassoverExercises.Question3;

public class Cello {
    private Contact[] arrC;
    private int current;

    public Cello() {
        this.arrC = new Contact[1000];
        this.current = 0;
    }

    public Contact numInContacts(String num) {
        for (int i = 0; i < current; i++) {
            if (arrC[i].getTel().equals(num)) {
                return arrC[i];
            }
        }
        return null;
    }



    public Contact[] getArrC() {
        return arrC;
    }

    public void setArrC(Contact[] arrC) {
        this.arrC = arrC;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }
}
