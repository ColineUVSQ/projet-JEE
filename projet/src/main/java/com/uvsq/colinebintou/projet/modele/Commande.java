package com.uvsq.colinebintou.projet.modele;

import java.util.ArrayList;

public class Commande {
	private ArrayList<IPanier> paniers;

	public Commande() {
		paniers = new ArrayList<IPanier>();
	}
	
	public boolean ajouter(IPanier p) {
		if(paniers.add(p)) return true;
		else return false;
	}
	
	public boolean supprimer(IPanier p) {
		if(paniers.remove(p)) return true;
		else return false;
	}
	
	public String affiche() {
		String chaine = "";
		int i = 1;
		for (IPanier p : paniers) {
			chaine += "panier numero " + i + p.affiche();
			i++;
		}
		return chaine;
	}
}
