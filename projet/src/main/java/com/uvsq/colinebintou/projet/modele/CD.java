package com.uvsq.colinebintou.projet.modele;

public class CD extends Article implements IArticle {
	private String artiste;
	
	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getArtiste() {
		return artiste;
	}
	
	public void setArtiste(String artiste) {
		this.artiste = artiste;
	}

	@Override
	public String toString() {
		return super.toString() + " " + getArtiste();
	}
	
	@Override
	public double calculPrix() {
		return super.getPrix();
	}

}
