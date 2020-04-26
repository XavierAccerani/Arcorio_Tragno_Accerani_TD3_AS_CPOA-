package com.iut.as.modele;

public abstract class Compte {

	protected double solde;
	protected String numeroCompte;
	
	public abstract void debiter(double montant);
	
	public void crediter(double montant) {
		
	}
}
