package com.iut.as.main;

import com.iut.as.modele.*;

public class StartPoint {

	public static void main(String[] args) {
		
		Client client = new Client("1", "Rue", "Gaston");
		CompteSansDecouvert compteSimple = new CompteSansDecouvert(1000, "AZERTY");
		client.ajoutCompte(compteSimple);
		
		client.possedeCompte(compteSimple.getNumeroCompte());
		Compte compteSimpleTest = client.retournerCompte("AZERTY");
		
		Bank.getBank().ajoutClient(client);
		
		Bank.getBank().consultation(compteSimple.getNumeroCompte());
		Bank.getBank().depot(compteSimple.getNumeroCompte(), "Gaston", 200);
		Bank.getBank().consultation(compteSimple.getNumeroCompte());
		Bank.getBank().retrait(compteSimple.getNumeroCompte(), "Gaston", 400);
		Bank.getBank().consultation(compteSimple.getNumeroCompte());
	}

}
