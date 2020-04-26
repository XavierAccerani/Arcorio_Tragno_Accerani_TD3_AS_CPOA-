package com.iut.as.modele;

import java.util.ArrayList;

public class Client {
	
	private String numeroClient;
	private String adresse;
	private String nom;
	private ArrayList<Compte> titulaireDeCompte;
	
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
	
	
	
	
}
