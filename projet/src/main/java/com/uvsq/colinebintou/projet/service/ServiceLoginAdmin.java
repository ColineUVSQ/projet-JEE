package com.uvsq.colinebintou.projet.service;

import java.util.ArrayList;

import com.uvsq.colinebintou.projet.modele.Administrateur;

public interface ServiceLoginAdmin {
	Administrateur creerAdmin(Administrateur a);
	Administrateur isValid(String login, String password);
	Administrateur changePassword(Administrateur c, String newPass);
	ArrayList<Administrateur> findAllAdmins();
}
