package com.uvsq.colinebintou.projet.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.uvsq.colinebintou.projet.modele.Livre;

public class LivreDAO extends HibernateDaoSupport implements DAO<Livre>{

	public Livre create(Livre obj) {
		int id = (Integer) getHibernateTemplate().save(obj);
		if (id != 0) {
			return obj;
		}
		else {
			return null;
		}
	}

	public Livre findbyId(int id) {
		Livre l = (Livre) getHibernateTemplate().get(Livre.class, id);
		return l;
	}

	public Livre update(Livre obj) {
		Livre l = (Livre) getHibernateTemplate().get(Livre.class, obj.getId());
		if (l != null){
			getHibernateTemplate().update(obj);
		}
		return l;
	}

	public void delete(Livre obj) {
		getHibernateTemplate().delete(obj);
	}

}
