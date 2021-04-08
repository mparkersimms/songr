package com.mparkersimms.songr;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    Album albumItsOn;
    String title;
    String length;
    int trackNumber;

    public Song(String title, String length, int trackNumber, Album albumItsOn) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.albumItsOn = albumItsOn;
    }
    public Song(){}

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLength() {
        return length;
    }

    public Album getAlbumItsOn() {
        return albumItsOn;
    }

    public int getTrackNumber() {
        return trackNumber;
    }
}
