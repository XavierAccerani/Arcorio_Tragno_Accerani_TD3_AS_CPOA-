package com.iut.as.modele;

public class CompteAvecDecouvert extends Compte {
	
	private double decouvertAutorise;

	public CompteAvecDecouvert(double solde, String numeroCompte, double decouvertAutorise) {
		super(solde, numeroCompte);
		this.decouvertAutorise = decouvertAutorise;
	}

	@Override
	public void debiter(double montant) {
	}
}
