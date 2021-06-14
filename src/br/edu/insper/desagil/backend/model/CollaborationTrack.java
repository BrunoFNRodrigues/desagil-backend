package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.List;

public class CollaborationTrack extends Track{
	private List<Artist> colaboradores;

	public CollaborationTrack(Artist artist, String name, int duration, List<Artist> colaboradores) {
		super(artist, name, duration);
		this.colaboradores = colaboradores;
	}
	
	public String getFullArtistName() {
		List<String> lista = new ArrayList<>();
		for (Artist artista: colaboradores) {
			lista.add(artista.getName());
		}
		return getArtist().getName()+" (feat. "+String.join(", ", lista)+")";
	}
}
