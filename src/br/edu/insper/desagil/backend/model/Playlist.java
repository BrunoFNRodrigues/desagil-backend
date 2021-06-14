package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Playlist {
	private int id;
	private List<Track> tracks;
	private Map<String,Integer> ratings;
	public Playlist(int id) {
		super();
		this.id = id;
		this.tracks = new ArrayList<>();
		this.ratings = new HashMap<>();
	}
	public int getId() {
		return id;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public Map<String, Integer> getRatings() {
		return ratings;
	}

	public void addTrack(Track track) {
		this.tracks.add(track);
	}
	
	public void putRating(String nome, int nota) {
		this.ratings.put(nome, nota);
	}
	
	public double averageRatings() {
		double tot = 0.0;
		for (String nome:ratings.keySet()) {
			int nota = ratings.get(nome);
			tot = tot + nota;
		}
		if (ratings.size() != 0) {
			tot = tot/ratings.size();;
		}
		int i = (int) tot;
		double d = tot - i;
		if (d < 0.26) {
			return i+0.0;
		}
		if (d < 0.74) {
			return i+0.5;
		}
		if (d >= 0.74) {
			return i+1.0;
		}
		return 0.0;
	}
}
