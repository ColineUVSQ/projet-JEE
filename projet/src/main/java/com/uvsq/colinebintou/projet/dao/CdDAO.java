package com.uvsq.colinebintou.projet.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.uvsq.colinebintou.projet.modele.CD;

public class CdDAO extends HibernateDaoSupport implements DAO<CD> {

	public CD create(CD obj) {
		int id = (Integer) getHibernateTemplate().save(obj);
		if (id != 0) {
			return obj;
		}
		else {
			return null;
		}
	}

	public CD findbyId(int id) {
		CD c = (CD) getHibernateTemplate().get(CD.class, id);
		return c;
	}

	public CD update(CD obj) {
		CD c = (CD) getHibernateTemplate().get(CD.class, obj.getId());
		if (c != null){
			getHibernateTemplate().update(obj);
		}
		return c;
	}

	public void delete(CD obj) {
		getHibernateTemplate().delete(obj);
	}

}
