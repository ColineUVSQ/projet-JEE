package com.uvsq.colinebintou.projet.service;

import com.uvsq.colinebintou.projet.dao.CdDAO;
import com.uvsq.colinebintou.projet.modele.CD;

public class ServiceGestionCDImpl implements ServiceGestionCD {
	private CdDAO dao;
	
	public CdDAO getDao() {
		return dao;
	}

	public void setDao(CdDAO dao) {
		this.dao = dao;
	}

	public CD ajoutCD(CD c) {
		return dao.create(c);
	}

	public void suppCD(CD c) {
		dao.delete(c);
	}

}
