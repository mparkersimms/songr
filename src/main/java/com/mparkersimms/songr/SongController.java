package com.mparkersimms.songr;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller

public class SongController {

    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    SongRepository songRepository;

    @PostMapping("/song{id}")
    public RedirectView addSong(String title, String length, int trackNumber, @PathVariable long id){
        System.out.println("===========================================");
        System.out.println("do we even get here?");
        Album albumThatHasSongs = albumRepository.getOne(id);
        Song song = new Song(title, length, trackNumber, albumThatHasSongs);
        songRepository.save(song);
        return new RedirectView("/album{id}");

    }
}
