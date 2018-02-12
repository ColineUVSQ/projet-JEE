package com.uvsq.colinebintou.projet.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.uvsq.colinebintou.projet.modele.Client;


public class ClientDAO extends HibernateDaoSupport implements DAO<Client> {

	public Client create(Client obj) {
		int id = (Integer) getHibernateTemplate().save(obj);
		if (id != 0) {
			return obj;
		}
		else {
			return null;
		}
	}

	public Client find(Client obj) {
		Client c = (Client) getHibernateTemplate().get(Client.class, obj.getId());
		return c;
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

}
