package com.uvsq.colinebintou.projet.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.uvsq.colinebintou.projet.form.InscriptionForm;
import com.uvsq.colinebintou.projet.modele.Client;
import com.uvsq.colinebintou.projet.service.ServiceLoginClient;

public class InscriptionAction extends Action {
	private ServiceLoginClient serviceClient = null;
	
	public void setServiceLoginClient(ServiceLoginClient serviceClient) {
		this.serviceClient = serviceClient;
	}
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception{
			InscriptionForm donnees = (InscriptionForm) form;
			System.out.println("suis dans la helloworld ");
			
			Client client = new Client();
			client.setNom(donnees.getName());
			client.setLogin(donnees.getLogin());
			client.setPassword(donnees.getPassword());
			serviceClient.creerClient(client);
			
			return mapping.findForward("success");
		}
}
