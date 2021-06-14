package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.List;

public class CollaborationTrack extends Track{
	private List<Artist> colalborators;

	public CollaborationTrack(Artist artist, String name, int duration, List<Artist> colalborators) {
		super(artist, name, duration);
		this.colalborators = colalborators;
	}
	
	public String getFullArtistName() {
		List<String> lista = new ArrayList<>();
		for (Artist artista: colalborators) {
			lista.add(artista.getName());
		}
		return getArtist().getName()+" (feat. "+String.join(", ", lista)+")";
	}
}
