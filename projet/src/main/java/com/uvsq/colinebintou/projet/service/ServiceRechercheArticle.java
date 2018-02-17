package com.uvsq.colinebintou.projet.service;

import java.util.ArrayList;

import com.uvsq.colinebintou.projet.modele.Article;

public interface ServiceRechercheArticle {
	Article findByName(String name);
	ArrayList<Article> findAllDispo();
}
