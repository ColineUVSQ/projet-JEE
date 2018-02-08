package com.uvsq.colinebintou.projet.modele;

public class Client extends Utilisateur implements IUtilisateur {
	private Commande commandes;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commande getCommandes() {
		return commandes;
	}

	public void setCommandes(Commande commandes) {
		this.commandes = commandes;
	}

	@Override
	public String toString() {
		return super.toString() + " " + commandes.affiche();
	}
	
}
