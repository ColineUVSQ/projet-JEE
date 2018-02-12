package com.uvsq.colinebintou.projet.modele;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Panier implements IPanier {
	private int id;
	private Set<Article>  articles;
	private boolean paye;
	
	public Panier() {
		articles = new HashSet<Article>();
		paye = false;
	}
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Set<Article> getArticles() {
		return articles;
	}

	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}

	public boolean isPaye() {
		return paye;
	}
	
	public void setPaye(boolean paye) {
		this.paye = paye;
	}
	
	public boolean ajouter(Article a) {
		if (articles.add(a)) return true;
		else return false;
	}
	
	public boolean supprimer(Article a) {
		if (articles.remove(a)) return true;
		else return false;
	}
	
	public double calculPrix() {
		double prixTotal = 0.0;
		for (Article a : articles) {
			prixTotal += a.calculPrix();
		}
		return prixTotal;
	}
	
	public String affiche() {
		String chaine = "";
		int i = 1;
		for (Article a : articles) {
			chaine += "article numero "+ i + ": " + a.toString();
			chaine += "\n";
			i++;
		}
		return chaine;
	}
	
}
