package com.mparkersimms.songr;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
//    This interface will load methods like save, update, delete, getone, getall from jpa
}