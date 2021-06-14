package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
		assertEquals("0:00", new Track(artista1,nome,0).getDurationString);
	}

	@Test
	void testFiveSeconds() {
		assertEquals(true, new Track(artista1,nome,5).getDurationString);
	}

	@Test
	void testTwentyFiveSeconds() {
		assertEquals(true, new Track(artista1,nome,25).getDurationString);
	}

	@Test
	void testOneMinuteZeroSeconds() {
		assertEquals(true, new Track(artista1,nome,60).getDurationString);
	}

	@Test
	void testOneMinuteFiveSeconds() {
		assertEquals(true, new Track(artista1,nome,65).getDurationString);
	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		assertEquals(true, new Track(artista1,nome,85).getDurationString);
	}

	@Test
	void testTwoMinutesZeroSeconds() {
		assertEquals(true, new Track(artista1,nome,120).getDurationString);
	}

	@Test
	void testTwoMinutesFiveSeconds() {
		assertEquals(true, new Track(artista1,nome,125).getDurationString);
	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		assertEquals(true, new Track(artista1,nome,145).getDurationString);
	}

	@Test
	void testOneCollaborator() {
		assertEquals("Anitta (feat. Becky G)", new CollaborationTrack(artista2,"tua cara",180,["Becky G"]).getFullArtisitName());
	}

	@Test
	void testTwoCollaborators() {
		assertEquals("Anitta (feat. Becky G)", new CollaborationTrack(artista2,"vem pro play",180,["Becky G"]).getFullArtisitName());
	}
}
