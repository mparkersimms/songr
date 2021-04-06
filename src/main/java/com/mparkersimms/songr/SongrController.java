package com.mparkersimms.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Locale;

@Controller
public class SongrController {

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
    public String renderHomePage(){
        return "splash.html";
    }

    @GetMapping("/albums")
    public String renderAlbumsPage(
            Model m
    ){
        ArrayList<Album> albums = new ArrayList<>();
        Album album1 = new Album("Busyhead", "Noah Kahan", 10, "35 min 28 sec", "https://atwoodmagazine.com/wp-content/uploads/2019/06/Busyhead-Noah-Kahan-1-1050x700.jpg" );
        albums.add(album1);
        Album album2 = new Album("Come Tomorrow", "Dave Matthews Band", 14, "54 min 33 sec", "https://upload.wikimedia.org/wikipedia/en/0/0a/Come-tomorrow-cover-art.jpg" );
        albums.add(album2);
        Album album3 = new Album("Awake", "Tycho", 8, "36 min 47 sec", "http://blog.iso50.com/wp-content/uploads/2013/12/Awake-450.jpg" );
        albums.add(album3);
        String test = "Test";
        m.addAttribute("albums", albums);
        return "albums.html";
    }



}
