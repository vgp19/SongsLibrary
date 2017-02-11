package utils;

import java.util.Objects;

/**
 * Created by vivekpatel on 2/11/17.
 */
public class SongNode implements Comparable{

    String name;
    String artist;
    SongNode next;

    public SongNode(String name, String artist, SongNode next){
        this.name=name;
        this.artist=artist;
        this.next=next;
    }
    @Override
    public int compareTo(Object o) {
        if(o==null ||!(o instanceof SongNode))
            return -1;
        SongNode tmp=(SongNode) o;
        return this.name.compareToIgnoreCase(tmp.name);
    }

    public boolean equals(Object o){
        if(o==null||!(o instanceof SongNode))
            return false;
        SongNode tmp=(SongNode) o;
        if(tmp.name.equalsIgnoreCase(this.name)&&tmp.artist.equalsIgnoreCase(this.artist))
            return true;
        else
            return false;
    }
}
