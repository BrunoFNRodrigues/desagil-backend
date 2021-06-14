package br.edu.insper.desagil.backend.model;

public class Track {
	private Artist artist;
	private String name;
	private int duration;
	
	public Track(Artist artist, String name, int duration) {
		super();
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}

	public Artist getArtist() {
		return artist;
	}

	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}
	
	public String getDurationString() {
		int duracao = this.duration;
		int min = 0;
		while (duracao >= 60) {
			if (duracao-60 >= 0) {
				duracao -= 60;
				min += 1;
			}
		}
		if (duracao < 10) {
			return min+":0"+duracao;
		}else {
			return min+":"+duracao;
		}
	}
	
	public String getFullArtistName() {
		return this.artist.getName();
	}
}
