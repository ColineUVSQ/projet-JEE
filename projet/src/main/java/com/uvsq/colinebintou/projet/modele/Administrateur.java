package com.uvsq.colinebintou.projet.modele;

public class Administrateur extends Utilisateur implements IUtilisateur {
	
	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.getId() + " " + super.getNom() + " " + super.getLogin() + " " + super.getPassword() + " ";
	}

}
