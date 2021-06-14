package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {
	private String nome = "Blood//Water";
	private Artist artista1;
	private Artist artista2;
	@BeforeEach
	void setUp() {
		artista1 = new Artist("grandson");
		artista2 = new Artist("Anitta");
	}

	@Test
	void testZeroSeconds() {
		assertEquals("0:00", new Track(artista1,nome,0).getDurationString());
	}

	@Test
	void testFiveSeconds() {
		assertEquals("0:05", new Track(artista1,nome,5).getDurationString());
	}

	@Test
	void testTwentyFiveSeconds() {
		assertEquals("0:25", new Track(artista1,nome,25).getDurationString());
	}

	@Test
	void testOneMinuteZeroSeconds() {
		assertEquals("1:00", new Track(artista1,nome,60).getDurationString());
	}

	@Test
	void testOneMinuteFiveSeconds() {
		assertEquals("1:05", new Track(artista1,nome,65).getDurationString());
	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		assertEquals("1:25", new Track(artista1,nome,85).getDurationString());
	}

	@Test
	void testTwoMinutesZeroSeconds() {
		assertEquals("2:00", new Track(artista1,nome,120).getDurationString());
	}

	@Test
	void testTwoMinutesFiveSeconds() {
		assertEquals("2:05", new Track(artista1,nome,125).getDurationString());
	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		assertEquals("2:25", new Track(artista1,nome,145).getDurationString());
	}

	@Test
	void testOneCollaborator() {
		List<Artist> colabs = new ArrayList<>();
		colabs.add(new Artist("Becky G"));
		assertEquals("Anitta (feat. Becky G)", new CollaborationTrack(artista2,"tua cara",180,colabs).getFullArtistName());
	}

	@Test
	void testTwoCollaborators() {
		List<Artist> colabs = new ArrayList<>();
		colabs.add(new Artist("Ludmilla"));
		colabs.add(new Artist("Snoop Dog"));
		assertEquals("Anitta (feat. Ludmilla, Snoop Dog)", new CollaborationTrack(artista2,"vem pro play",180,colabs).getFullArtistName());
	}
}
