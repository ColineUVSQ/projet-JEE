package com.uvsq.colinebintou.projet.modele;

public interface IArticle {
	int id = 0; //public static final
	void setId(int id);
	int getId();
	String toString();
	double calculPrix();
}
