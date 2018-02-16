package com.uvsq.colinebintou.projet.dao;

import java.util.ArrayList;

import com.uvsq.colinebintou.projet.modele.CD;

public interface CdDAO extends DAO<CD>{
	ArrayList<CD> findAll();
}
