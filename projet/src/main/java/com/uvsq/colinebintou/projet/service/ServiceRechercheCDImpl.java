package com.uvsq.colinebintou.projet.service;

import java.util.ArrayList;

import com.uvsq.colinebintou.projet.dao.CdDAO;
import com.uvsq.colinebintou.projet.dao.CdDAOImpl;
import com.uvsq.colinebintou.projet.modele.CD;

public class ServiceRechercheCDImpl implements ServiceRechercheCD{
	private CdDAO dao;
	
	public CdDAO getDao() {
		return dao;
	}


	public void setDao(CdDAO dao) {
		this.dao = dao;
	}
	
	public ArrayList<CD> findAllCD() {
		return dao.findAll();
	}

}
