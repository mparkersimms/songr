package com.mparkersimms.songr;

public class Album {
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
}
