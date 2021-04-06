package com.mparkersimms.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;


@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test public void albumTest(){
		Album testAlbum = new Album("Test title", "Test Artist", 10, "test length", "test URL");

		System.out.println("testAlbum.artist = " + testAlbum.artist);
		Assert.hasText(testAlbum.artist,"The testAlbum should contain the artist");

	}

}
