package com.uvsq.colinebintou.projet.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.uvsq.colinebintou.projet.modele.Client;

public class ClientDAOImpl extends HibernateDaoSupport implements ClientDAO {

	public Client create(Client obj) {
		int id = (Integer) getHibernateTemplate().save(obj);
		if (id != 0) {
			return obj;
		}
		else {
			return null;
		}
	}

	public Client findbyId(int id) {
		Client c = (Client) getHibernateTemplate().get(Client.class, id);
		return c;
	}
	
	public Client findbyLoginPassword(String login, String password) {
		//getHibernateTemplate().createCriteria(Client.class);
		List<Client> clients = getHibernateTemplate().find("from Client where login=? and password=?", login, password);
		if (clients.size() != 0) {
			return clients.get(0);
		}
		else{
			return null;
		}
	}
	
	public Client update(Client obj) {
		Client c = (Client) getHibernateTemplate().get(Client.class, obj.getId());
		if (c != null){
			getHibernateTemplate().update(obj);
		}
		return c;
	}

	public void delete(Client obj) {
		getHibernateTemplate().delete(obj);
	}

	public Set<Client> findAll() {
		List<Client> clients = getHibernateTemplate().find("from Client");
		Set<Client> clientsSet = new HashSet<Client>();
		for (Client c : clients) {
			clientsSet.add(c);
		}
		return clientsSet;
	}

}
