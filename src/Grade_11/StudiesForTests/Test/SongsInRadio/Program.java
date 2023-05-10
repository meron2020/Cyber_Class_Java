package Grade_11.StudiesForTests.Test.SongsInRadio;

public class Program {
    public static void galatzArtist(int reprisalWorth, String artistName, Radio galatz) {
        if (galatz.artistInList(artistName)) {
            System.out.println(galatz.getArtistReprisal(artistName) * reprisalWorth);
        }
        else {
            galatz.addArtist(artistName);
        }
    }
}
