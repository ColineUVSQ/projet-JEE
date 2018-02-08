package com.uvsq.colinebintou.projet.modele;

public class DVD extends Article implements IArticle {
	private String realisateur;
	
	public DVD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getRealisateur() {
		return realisateur;
	}
	
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	@Override
	public String toString() {
		return super.toString() + " " + getRealisateur();
	}
	
	@Override
	public double calculPrix() {
		return super.getPrix();
	}

}
