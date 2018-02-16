package com.uvsq.colinebintou.projet.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.uvsq.colinebintou.projet.modele.Administrateur;

public class AdministrateurDAO extends HibernateDaoSupport implements DAO<Administrateur>{

	public Administrateur create(Administrateur obj) {
		int id = (Integer) getHibernateTemplate().save(obj);
		if (id != 0) {
			return obj;
		}
		else {
			return null;
		}
	}

	public Administrateur findbyId(int id) {
		Administrateur d = (Administrateur) getHibernateTemplate().get(Administrateur.class, id);
		return d;
	}

	public Administrateur update(Administrateur obj) {
		Administrateur d = (Administrateur) getHibernateTemplate().get(Administrateur.class, obj.getId());
		if (d != null){
			getHibernateTemplate().update(obj);
		}
		return d;
	}

	public void delete(Administrateur obj) {
		getHibernateTemplate().delete(obj);
	}

}
