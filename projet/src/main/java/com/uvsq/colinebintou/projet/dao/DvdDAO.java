package com.uvsq.colinebintou.projet.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.uvsq.colinebintou.projet.modele.DVD;

public class DvdDAO extends HibernateDaoSupport implements DAO<DVD> {

	public DVD create(DVD obj) {
		int id = (Integer) getHibernateTemplate().save(obj);
		if (id != 0) {
			return obj;
		}
		else {
			return null;
		}
	}

	public DVD findbyId(int id) {
		DVD d = (DVD) getHibernateTemplate().get(DVD.class, id);
		return d;
	}

	public DVD update(DVD obj) {
		DVD d = (DVD) getHibernateTemplate().get(DVD.class, obj.getId());
		if (d != null){
			getHibernateTemplate().update(obj);
		}
		return d;
	}

	public void delete(DVD obj) {
		getHibernateTemplate().delete(obj);
	}

}
