package com.iut.as.modele;

public abstract class Compte {

	protected double solde;
	protected String numeroCompte;
	
	public Compte(double solde, String numeroCompte) {
		this.solde = solde;
		this.numeroCompte = numeroCompte;
	}
	
	public abstract void debiter(double montant);
	
	public void crediter(double montant) {
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	@Override
	public String toString() {
		return "Compte [solde=" + solde + ", numeroCompte=" + numeroCompte + "]";
	}
}
