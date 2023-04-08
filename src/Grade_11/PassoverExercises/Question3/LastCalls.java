package Grade_11.PassoverExercises.Question3;

public class LastCalls {
    private String[] t;

    public LastCalls() {
        this.t = new String[50];
    }

    public void addPhoneCall(String call) {
        String[] updatedCalls = new String[50];
        for (int i = 0; i < 49; i++) {
            updatedCalls[i+1] = this.t[i];
        }
        updatedCalls[0] = call;
        this.t = updatedCalls;
    }

    public void updateLastCalls(Cello cello) {
        for (int i = 0; i < t.length; i++) {
            Contact contact = cello.numInContacts(t[i]);
            if (contact != null) {
                t[i] = contact.getName();
            }
        }
    }

    public String[] getT() {
        return t;
    }

    public void setT(String[] t) {
        this.t = t;
    }
}
