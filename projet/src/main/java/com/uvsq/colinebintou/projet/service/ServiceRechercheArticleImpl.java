package com.uvsq.colinebintou.projet.service;

import java.util.ArrayList;

import com.uvsq.colinebintou.projet.dao.ArticleDAO;
import com.uvsq.colinebintou.projet.dao.LivreDAO;
import com.uvsq.colinebintou.projet.modele.Article;
import com.uvsq.colinebintou.projet.modele.CD;
import com.uvsq.colinebintou.projet.modele.DVD;
import com.uvsq.colinebintou.projet.modele.Livre;

public class ServiceRechercheArticleImpl implements ServiceRechercheArticle {
	ArticleDAO artDao;
	LivreDAO livDao;
	
	public ArticleDAO getArtDao() {
		return artDao;
	}

	public void setArtDao(ArticleDAO dao) {
		this.artDao = dao;
	}
	
	public LivreDAO getLivDao() {
		return livDao;
	}

	public void setLivDao(LivreDAO livDao) {
		this.livDao = livDao;
	}

	public Article findByName(String name) {
		return artDao.findByName(name);
	}

	public ArrayList<Article> findAllDispo() {
		return artDao.findAllDispo();
	}

}
