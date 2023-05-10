package Grade_11.StudiesForTests.Matkonet.Question2;

public class AllKorona {
    private KoronaCity[] K;
    private int nCity;

    public KoronaCity[] getK() {
        return K;
    }

    public void setK(KoronaCity[] k) {
        K = k;
    }

    public int getnCity() {
        return nCity;
    }

    public void setnCity(int nCity) {
        this.nCity = nCity;
    }

    public AllKorona() {
        K = new KoronaCity[100];
        nCity = 0;
    }

    public boolean addCity(KoronaCity city) {
        if (nCity < 100) {
            K[nCity] = city;
            nCity++;
            return true;
        }
        return false;
    }
}
