package com.uvsq.colinebintou.projet.service;

import java.util.ArrayList;
import java.util.Set;

import com.uvsq.colinebintou.projet.modele.Article;
import com.uvsq.colinebintou.projet.modele.CD;
import com.uvsq.colinebintou.projet.modele.DVD;
import com.uvsq.colinebintou.projet.modele.Livre;

public interface ServiceRechercheArticle {
	Article findByName(String name);
	ArrayList<Article> findAllDispo();
}
