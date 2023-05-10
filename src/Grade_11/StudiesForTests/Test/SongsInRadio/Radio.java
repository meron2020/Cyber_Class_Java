package Grade_11.StudiesForTests.Test.SongsInRadio;

import Grade_11.DataStructures.NodeClass;

public class Radio {
    NodeClass<Artist> artists;
    NodeClass<Song> songs;

    public boolean artistInList(String artist) {
        NodeClass<Artist> p = artists;
        while (p != null) {
            if (p.getValue().getName() == artist) {
                return true;
            }
            p = p.getNext();
        }
        return false;
    }

    public void addArtistReprisal(String artist) {
        NodeClass<Artist> p = artists;
        while (p != null) {
            if (p.getValue().getName() == artist) {
                int currentReprisal = p.getValue().getReprisal();
                p.getValue().setReprisal(currentReprisal + 1);
            }
            p = p.getNext();
        }
    }

    public void addSong(String name, String writer, String creator, String singer) {
        songs = new NodeClass<Song>(new Song(name, writer, creator, singer, 0), songs);
        if (!this.artistInList(singer)) {
            Artist artist = new Artist(singer, 0);
            this.artists = new NodeClass<Artist>(artist, artists);
        }
        if (!this.artistInList(writer)) {
            Artist artist = new Artist(writer, 0);
            this.artists = new NodeClass<Artist>(artist, artists);
        }

        if (!this.artistInList(creator)) {
            Artist artist = new Artist(creator, 0);
            this.artists = new NodeClass<Artist>(artist, artists);
        }
    }

    public void listenToSong(String song) {
        NodeClass<Song> p = this.songs;
        while (p != null) {
            if (p.getValue().getName().equals(song)) {
                p.getValue().setNumOfTimesPlayed(p.getValue().getNumOfTimesPlayed() + 1);
                addArtistReprisal(p.getValue().getCreator());
                addArtistReprisal(p.getValue().getSinger());
                addArtistReprisal(p.getValue().getWriter());
                p = null;
            } else {
                p = p.getNext();
            }
        }
    }

    public int getArtistReprisal(String artist) {
        NodeClass<Artist> p = artists;
        while (p != null) {
            if (p.getValue().getName() == artist) {
                return p.getValue().getReprisal();
            }
            p = p.getNext();
        }
        return 0;
    }

    public void addArtist(String artist) {
        this.artists = new NodeClass<Artist>(new Artist(artist, 0), this.artists);
    }

    public NodeClass<Artist> getArtists() {
        return artists;
    }

    public void setArtists(NodeClass<Artist> artists) {
        this.artists = artists;
    }

    public NodeClass<Song> getSongs() {
        return songs;
    }

    public void setSongs(NodeClass<Song> songs) {
        this.songs = songs;
    }
}
