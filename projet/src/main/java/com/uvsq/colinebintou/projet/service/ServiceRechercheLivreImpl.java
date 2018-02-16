package com.uvsq.colinebintou.projet.service;

import java.util.ArrayList;

import com.uvsq.colinebintou.projet.dao.LivreDAO;
import com.uvsq.colinebintou.projet.modele.CD;
import com.uvsq.colinebintou.projet.modele.DVD;
import com.uvsq.colinebintou.projet.modele.Livre;

public class ServiceRechercheLivreImpl implements ServiceRechercheLivre{
	private LivreDAO dao;
	
	public LivreDAO getDao() {
		return dao;
	}

	public void setDao(LivreDAO dao) {
		this.dao = dao;
	}

	public ArrayList<Livre> findAllLivre() {
		return dao.findAll();
	}
}
