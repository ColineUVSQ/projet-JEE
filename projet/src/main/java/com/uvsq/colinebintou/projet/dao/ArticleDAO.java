package com.uvsq.colinebintou.projet.dao;

import java.util.ArrayList;

import com.uvsq.colinebintou.projet.modele.Article;

public interface ArticleDAO extends DAO<Article>{
	Article findByName(String name);
	ArrayList<Article> findAllDispo();
}
