package com.uvsq.colinebintou.projet.modele;

import java.util.ArrayList;

public class Panier implements IPanier {
	private ArrayList<IArticle>  articles;
	private boolean paye;
	
	public Panier() {
		articles = new ArrayList<IArticle>();
		paye = false;
	}
	
	public boolean isPaye() {
		return paye;
	}
	
	public void setPaye(boolean paye) {
		this.paye = paye;
	}
	
	public boolean ajouter(IArticle a) {
		if (articles.add(a)) return true;
		else return false;
	}
	
	public boolean supprimer(IArticle a) {
		if (articles.remove(a)) return true;
		else return false;
	}
	
	public double calculPrix() {
		double prixTotal = 0.0;
		for (IArticle a : articles) {
			prixTotal += a.calculPrix();
		}
		return prixTotal;
	}
	
	public String affiche() {
		String chaine = "";
		int i = 1;
		for (IArticle a : articles) {
			chaine += "article numero "+ i + ": " + a.toString();
			chaine += "\n";
			i++;
		}
		return chaine;
	}
	
}
