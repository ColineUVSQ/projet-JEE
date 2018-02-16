package com.uvsq.colinebintou.projet.service;

import java.util.Set;

import com.uvsq.colinebintou.projet.modele.Client;

public interface ServiceLoginClient {
	Client creerClient(Client c);
	Client isValid(String login, String password);
	Client changePassword(Client c, String newPass);
	Set<Client> findAllClients();
}
