package com.iut.as.modele;

import java.util.ArrayList;
import java.util.Optional;

public class Client {
	
	private String numeroClient;
	private String adresse;
	private String nom;
	private ArrayList<Compte> titulaireDeCompte = new ArrayList<Compte>();
	
	// Constructeur
	public Client(String numeroClient, String adresse, String nom) {
		this.numeroClient = numeroClient;
		this.adresse = adresse;
		this.nom = nom;
	}
	
	// Pour tests, à virer...
	public Client() {}
	
	// Getters - Setters
	/**
	 * @return the numeroClient
	 */
	public String getNumeroClient() {
		return numeroClient;
	}
	/**
	 * @param numeroClient the numeroClient to set
	 */
	public void setNumeroClient(String numeroClient) {
		this.numeroClient = numeroClient;
	}
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	// Méthode d'ajout de compte
	public void ajoutCompte(Compte compte) {
		this.titulaireDeCompte.add(compte);
	}
	
	// Méthode de vérification de possession d'un compte
	public boolean possedeCompte(String numCompte) {
		boolean compteTrouve = false;
		for (Compte compte : titulaireDeCompte) {
			if (compte.getNumeroCompte().equals(numCompte)) {
				compteTrouve = true;
			}
		}
		return compteTrouve;
	}
	
	// Méthode permettant de retourner le compte d'un client
	public Compte retournerCompte(String numCompte) {
		Optional<Compte> compteRecherche = this.titulaireDeCompte.stream().
				filter(cpte -> cpte.getNumeroCompte().equals(numCompte)).
				findFirst();
		// ifPresent() -> gérer les exceptions
		Compte compte = compteRecherche.get();
		return compte;
	}
}
