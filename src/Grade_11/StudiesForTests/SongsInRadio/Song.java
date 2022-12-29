package Grade_11.StudiesForTests.SongsInRadio;

public class Song {
    private String name;
    private String writer;
    private String creator;
    private String singer;
    private int numOfTimesPlayed;

    public Song(String name, String writer, String creator, String singer, int numOfTimesPlayed) {
        this.name = name;
        this.writer = writer;
        this.creator = creator;
        this.singer = singer;
        this.numOfTimesPlayed = numOfTimesPlayed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getNumOfTimesPlayed() {
        return numOfTimesPlayed;
    }

    public void setNumOfTimesPlayed(int numOfTimesPlayed) {
        this.numOfTimesPlayed = numOfTimesPlayed;
    }
}
