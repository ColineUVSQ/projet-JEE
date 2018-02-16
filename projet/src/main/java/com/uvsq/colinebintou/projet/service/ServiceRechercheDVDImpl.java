package com.uvsq.colinebintou.projet.service;

import java.util.ArrayList;

import com.uvsq.colinebintou.projet.dao.DvdDAO;
import com.uvsq.colinebintou.projet.modele.DVD;

public class ServiceRechercheDVDImpl implements ServiceRechercheDVD{
	private DvdDAO dao;
	
	public DvdDAO getDao() {
		return dao;
	}


	public void setDao(DvdDAO dao) {
		this.dao = dao;
	}
	
	public ArrayList<DVD> findAllDVD() {
		return dao.findAll();
	}

}
