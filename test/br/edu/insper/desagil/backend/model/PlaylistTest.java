package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {
	private static double DELTA = 0.000001;
	private Playlist playlist;
	@BeforeEach
	void setUp() {
		playlist = new Playlist(01);
	}

	@Test
	void testRoundDownToZero() {
		playlist.putRating("Jonathan",1);
		playlist.putRating("Joseph",2);
		playlist.putRating("Jotaro",3);
		playlist.putRating("Josuke",3);
		assertEquals(2.0, playlist.averageRatings(), DELTA);
	}
	
	@Test
	void testRoundUpToHalf() {
		playlist.putRating("Jonathan",1);
		playlist.putRating("Joseph",2);
		playlist.putRating("Jotaro",1);
		assertEquals(1.5, playlist.averageRatings(), DELTA);
	}

	@Test
	void testRoundDownToHalf() {
		playlist.putRating("Jonathan",1);
		playlist.putRating("Joseph",2);
		playlist.putRating("Jotaro",2);
		assertEquals(1.5, playlist.averageRatings(), DELTA);
	}

	@Test
	void testRoundUpToOne() {
		playlist.putRating("Jonathan",1);
		playlist.putRating("Joseph",1);
		playlist.putRating("Jotaro",2);
		playlist.putRating("Josuke",3);
		assertEquals(2.0, playlist.averageRatings(), DELTA);
	}
}
