package Grade_11.StudiesForTests.SongsInRadio;

public class Artist {
    private String name;
    private int reprisal;

    public Artist(String name, int reprisal) {
        this.name = name;
        this.reprisal = reprisal;
    }

    public void addReprisal() {
        this.reprisal += 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReprisal() {
        return reprisal;
    }

    public void setReprisal(int reprisal) {
        this.reprisal = reprisal;
    }
}
