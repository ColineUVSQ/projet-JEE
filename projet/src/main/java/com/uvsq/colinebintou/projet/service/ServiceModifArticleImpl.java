package com.uvsq.colinebintou.projet.service;

import com.uvsq.colinebintou.projet.dao.ArticleDAO;

import com.uvsq.colinebintou.projet.modele.Article;


public class ServiceModifArticleImpl implements ServiceModifArticle{
	private ArticleDAO artDao;
	
	public ArticleDAO getArtDao() {
		return artDao;
	}

	public void setArtDao(ArticleDAO artDao) {
		this.artDao = artDao;
	}
	
	public Article modifArticle(Article a, String newName) {
		Article anew = a;
		anew.setNom(newName);
		return artDao.update(anew);
	}

	public Article modifArticle(Article a, double newPrix) {
		Article anew = a;
		anew.setPrix(newPrix);
		return artDao.update(anew);
	}

	public Article modifArticle(Article a, int newQuantite) {
		Article anew = a;
		anew.setQuantite(newQuantite);
		return artDao.update(anew);
	}

}
