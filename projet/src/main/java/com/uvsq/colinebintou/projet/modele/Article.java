package com.uvsq.colinebintou.projet.modele;

public abstract class Article implements IArticle{
	private int id;
	private String nom;
	private double prix;
	private int quantite;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	public String toString() {
		return getId() + " " + getNom() + " " + getPrix() + " " + getQuantite();
	}
	
	public abstract double calculPrix();
}
