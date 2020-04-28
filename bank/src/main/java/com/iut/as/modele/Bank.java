package com.iut.as.modele;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.iut.as.interfaces.IDaoBank;

// ATTENTION : il faudra absolument gérer les erreurs pour les Optional !

public class Bank implements IDaoBank{


	
	private ArrayList<Client> listeClients = new ArrayList<Client>();
	private ArrayList<Compte> listeComptes = new ArrayList<Compte>();
	
	private static Bank banque;

	// Singletion d'instanciation
	public static Bank getBank() {
		if (banque == null) {
			banque = new Bank();
		}
		return banque;
	}
	
	// Constructeur privé
	private Bank() {}
	
	
	// Méthode d'ajout d'un client
	public void ajoutClient(Client client) {
		this.listeClients.add(client);
	}
	
	// Méthode de d'identification du client
	public Client identificationClient(String numCompte, String nomClient) {
		Optional<Client> clientRecherche = this.listeClients.stream().
				filter(client -> client.getNom().equals(nomClient) && client.possedeCompte(numCompte)).
				findFirst();
		// ifPresent() -> gérer les exceptions
		Client client = clientRecherche.get();
		return client;
	}
	
	// Méthode d'identification client à partir du numéro de compte
	public Client identificationClient(String numCompte) {
		Optional<Client> clientRecherche = this.listeClients.stream().
				filter(client -> client.possedeCompte(numCompte)).
				findFirst();
		// ifPresent() -> gérer les exceptions
		Client client = clientRecherche.get();
		return client;
	}
	
	public void retrait(String numCompte, String nomClient, double montant) {
		Client client = identificationClient(numCompte, nomClient);
		client.retournerCompte(numCompte).debiter(montant);
	}
	
	public void depot(String numCompte, String nomClient, double montant) {
		Client client = identificationClient(numCompte, nomClient);
		client.retournerCompte(numCompte).crediter(montant);
	}
	
	public void ouverture_compte(String nomClient) {
		
	}
	
	public void consultation(String numCompte) {
		Client client = identificationClient(numCompte);
		// Deux itérations -> à revoir...
		if(client.possedeCompte(numCompte)) {
			System.out.println(client.retournerCompte(numCompte));
		}
		else {
			System.out.println("Désolé, ce numéro de compte n'est pas valide");
		}
	}
	
	public double conversionFromEuro(double montant) {
		return 1.0;
	}
	
	public double conversionToEuro(double montant) {
		return 1.0;
	}


	@Override
	public void OuvertureCompte(String nom_client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Create(Object objet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update(Object objet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete(Object objet) {
		// TODO Auto-generated method stub
		
	}
}
