package utils;

/**
 * Created by vivekpatel on 2/11/17.
 */
public class SongNodeAlbumYear extends SongNode {
    String album;
    int year;

    public SongNodeAlbumYear(String name, String artist, SongNode next, String album, int year){
        super(name, artist, next);
        this.album=album;
        this.year=year;
    }
}
