package com.mparkersimms.songr;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Controller
public class SongrController {

    @Autowired
    public AlbumRepository albumRepository;

    @GetMapping("/hello")
    public String showHellowWorldPage(){
        return "hello-world.html";
    }
    @GetMapping("/capitalize/{phrase}")

    public String capitalizeThePhrase(
            Model m,
            @PathVariable String phrase){
        String capPhrase = phrase.toUpperCase(Locale.ROOT);
        m.addAttribute("phrase", capPhrase);
        return "capitalized.html";
    }
    @GetMapping("/")
    public String renderHomePage(
            Model m
    ){
        List<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "splash.html";
    }

    @GetMapping("/albums")
    public String renderAlbumsPage(
            Model m
    ){
        List<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "albums.html";
    }

    @PostMapping("/albums")
    public RedirectView addAlbumData(
            String title,
            String artist,
            int songCount,
            String albumLength,
            String imageUrl
    ){
        Album newAlbum = new Album(title, artist, songCount, albumLength, imageUrl);
        albumRepository.save(newAlbum);
        return new RedirectView("/");
    }
    @DeleteMapping("/albums{id}")
    public RedirectView deleteAlbumData(@PathVariable long id){
        albumRepository.deleteById(id);
        return new RedirectView("/albums");
    }

    @PutMapping("/albums{id}")
    public  RedirectView updateAlbumData(@PathVariable long id) {
        return new RedirectView("/album{id}");
    }

    @GetMapping("album{id}")
    public String renderAlbumPage(
            @PathVariable long id,
            Model m
    ){
        Album singleAlbum = albumRepository.getOne(id);
        m.addAttribute("album",singleAlbum);
        return "albums.html";
    }



}
