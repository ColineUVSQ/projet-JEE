package com.uvsq.colinebintou.projet.dao;

import java.util.ArrayList;

import com.uvsq.colinebintou.projet.modele.Livre;

public interface LivreDAO extends DAO<Livre> {
	ArrayList<Livre> findAll(); 
}
