package com.uvsq.colinebintou.projet.service;

import com.uvsq.colinebintou.projet.dao.PanierDAO;
import com.uvsq.colinebintou.projet.modele.Article;
import com.uvsq.colinebintou.projet.modele.Panier;

public class ServicePanierImpl implements ServicePanier{
	private PanierDAO dao;

	public PanierDAO getDao() {
		return dao;
	}

	public void setDao(PanierDAO dao) {
		this.dao = dao;
	}

	public Panier ajoutPanier(Article a, Panier p) {
		p.ajouter(a);
		dao.update(p);
		return p;
	}

	public void suppPanier(Article a, Panier p) {
		p.supprimer(a);
		dao.update(p);
	}

	public void validerPanier(Panier p) {
		p.setPaye(true);
		dao.update(p);
	}

	public Panier creerPanier(Panier p) {
		return dao.create(p);
	}

	public void suppPanier(Panier p) {
		dao.delete(p);
	}
	
}
