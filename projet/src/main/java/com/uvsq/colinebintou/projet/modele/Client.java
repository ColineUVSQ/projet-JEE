package com.uvsq.colinebintou.projet.modele;

public class Client extends Utilisateur implements IUtilisateur {
	private Commande commandes;
	
	public Client() {
		super();
		commandes = null;
	}

	public Commande getCommandes() {
		return commandes;
	}

	public void setCommandes(Commande commandes) {
		this.commandes = commandes;
	}

	@Override
	public String toString() {
		if(commandes == null) { 
			return super.toString();
		} else {
			return super.toString() + "\nses commandes : " + commandes.affiche();
		}
	}
	
}
