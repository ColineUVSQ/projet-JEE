package com.uvsq.colinebintou.projet.dao;

import java.util.ArrayList;

import com.uvsq.colinebintou.projet.modele.DVD;

public interface DvdDAO extends DAO<DVD>{
	ArrayList<DVD> findAll();
}
