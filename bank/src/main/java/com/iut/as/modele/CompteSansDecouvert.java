package com.iut.as.modele;

public class CompteSansDecouvert extends Compte {

	public CompteSansDecouvert(double solde, String numeroCompte) {
		super(solde, numeroCompte);
	}

	@Override
	public void debiter(double montant) {
		
	}
}
