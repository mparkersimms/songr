package com.mparkersimms.songr;


import javax.persistence.*;
import java.util.List;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;


    @OneToMany(mappedBy = "albumItsOn",cascade = CascadeType.ALL)
    List<Song> songs;

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

    public Album(){}

    public List<Song> getSongs() {
        return songs;
    }

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
