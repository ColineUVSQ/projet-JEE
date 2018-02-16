package com.uvsq.colinebintou.projet.dao;

import java.util.ArrayList;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.uvsq.colinebintou.projet.modele.Article;
import com.uvsq.colinebintou.projet.modele.Livre;

public class LivreDAOImpl extends HibernateDaoSupport implements LivreDAO{

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

	public ArrayList<Livre> findAll() {
		return (ArrayList<Livre>) getHibernateTemplate().find("from Article where type_article=?","LIVRE");
	}

}
