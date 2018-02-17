package com.uvsq.colinebintou.projet.service;

import com.uvsq.colinebintou.projet.modele.Article;

public interface ServiceModifArticle {
	Article modifArticle(Article a, String newName);
	Article modifArticle(Article a, double newPrix);
	Article modifArticle(Article a, int newQuantite);
	
}
