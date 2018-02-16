package com.uvsq.colinebintou.projet.dao;

import java.util.ArrayList;

import com.uvsq.colinebintou.projet.modele.Administrateur;

public interface AdministrateurDAO extends DAO<Administrateur> {
	Administrateur findbyLoginPassword(String login, String password);
	ArrayList<Administrateur> findAll();
}
