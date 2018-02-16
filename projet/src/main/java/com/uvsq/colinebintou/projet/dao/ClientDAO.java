package com.uvsq.colinebintou.projet.dao;

import java.util.Set;

import com.uvsq.colinebintou.projet.modele.Client;

public interface ClientDAO extends DAO<Client> {
	Client findbyLoginPassword(String login, String password);
	Set<Client> findAll();
}
