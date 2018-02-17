package com.uvsq.colinebintou.projet.service;

import java.util.ArrayList;

import com.uvsq.colinebintou.projet.dao.ArticleDAO;
import com.uvsq.colinebintou.projet.modele.Article;

public class ServiceRechercheArticleImpl implements ServiceRechercheArticle {
	ArticleDAO artDao;
	
	public ArticleDAO getArtDao() {
		return artDao;
	}

	public void setArtDao(ArticleDAO dao) {
		this.artDao = dao;
	}

	public Article findByName(String name) {
		return artDao.findByName(name);
	}

	public ArrayList<Article> findAllDispo() {
		return artDao.findAllDispo();
	}

}
