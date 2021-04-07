package com.mparkersimms.songr;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String title;
    String artist;
    int songCount;
    String albumLength;
    String imageUrl;

    public Album(String title, String artist, int songCount, String albumLength, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.albumLength = albumLength;
        this.imageUrl = imageUrl;
    }

    Album(){}

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public String getAlbumLength() {
        return albumLength;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public long getId() {
        return id;
    }
}
