package com.uvsq.colinebintou.projet.form;

import org.apache.struts.action.ActionForm;

public class InscriptionForm extends ActionForm{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String login;
	private String password;
	
	public InscriptionForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
