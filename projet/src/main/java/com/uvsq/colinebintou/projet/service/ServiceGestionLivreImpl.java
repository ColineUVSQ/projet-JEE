package com.uvsq.colinebintou.projet.service;

import com.uvsq.colinebintou.projet.dao.LivreDAO;
import com.uvsq.colinebintou.projet.modele.Livre;

public class ServiceGestionLivreImpl implements ServiceGestionLivre {
	private LivreDAO dao;
	
	public LivreDAO getDao() {
		return dao;
	}

	public void setDao(LivreDAO dao) {
		this.dao = dao;
	}

	public Livre ajoutLivre(Livre l) {
		return dao.create(l);
	}

	public void suppLivre(Livre l) {
		dao.delete(l);
	}

}
