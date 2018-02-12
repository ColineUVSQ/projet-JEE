package com.uvsq.colinebintou.projet.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uvsq.colinebintou.projet.dao.AdministrateurDAO;
import com.uvsq.colinebintou.projet.dao.ClientDAO;
import com.uvsq.colinebintou.projet.dao.LivreDAO;
import com.uvsq.colinebintou.projet.dao.PanierDAO;
import com.uvsq.colinebintou.projet.modele.*;


public class App {
	
	public static void main(String[] args) {
		Client c = new Client();
		c.setLogin("abc");
		c.setId(1);
		c.setPassword("def");
		c.setNom("ramou");
		System.out.println(c.getId());
		System.out.println(c.toString());
		
		Livre l = new Livre();
		l.setId(2);
		l.setAuteur("jkl");
		l.setNom("ijhu");
		l.setPrix(20.5);
		l.setQuantite(1);
		/*System.out.println(l.calculPrix());
		System.out.println(l.getAuteur());
		System.out.println(l.toString());*/
		
		CD cd = new CD();
		cd.setId(3);
		cd.setArtiste("1236");
		cd.setNom("ksol");
		cd.setPrix(15);
		cd.setQuantite(2);
		/*System.out.println(cd.getNom());
		System.out.println(cd.calculPrix());
		System.out.println(cd.toString());*/
		
		DVD d = new DVD();
		d.setId(4);
		d.setNom("doencnl");
		d.setPrix(26);
		d.setQuantite(1);
		d.setRealisateur("doenc");
		/*System.out.println(d.getQuantite());
		System.out.println(d.calculPrix());
		System.out.println(d.toString());*/
		
		Panier p = new Panier();
		p.ajouter(l);
		p.setPaye(false);
		p.ajouter(cd);
		p.ajouter(d);
		p.supprimer(cd);
		p.supprimer(d);
		
		//System.out.println(p.affiche());
		
		Commande com = new Commande();
		com.ajouter(p);
		//System.out.println(com.affiche());
		
		c.setCommandes(com);
		//System.out.println(c.toString());
		
		Administrateur a = new Administrateur();
		a.setId(5);
		a.setLogin("dêp");
		a.setPassword("87684");
		a.setNom("elocdjneo");
		System.out.println(a.toString());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); //-> chargement du contexte
		AdministrateurDAO admin = (AdministrateurDAO) context.getBean("daoAdmin");
		admin.create(a);
		System.out.println(admin.find(a));
		
		a.setNom("ramous");
		admin.update(a);
		//admin.delete(a);
		
		LivreDAO livre = (LivreDAO) context.getBean("daoLivre");
		PanierDAO panier = (PanierDAO) context.getBean("daoPanier");
		
		livre.create(l);
		panier.create(p);	
	}
}
