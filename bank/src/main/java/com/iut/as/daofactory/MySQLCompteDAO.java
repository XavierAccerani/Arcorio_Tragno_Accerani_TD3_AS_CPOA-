package com.iut.as.daofactory;

import com.iut.as.interfaces.IDaoCompte;
import com.iut.as.modele.Compte;

public class MySQLCompteDAO implements IDaoCompte<Compte> {

	private static MySQLCompteDAO instance;

	private MySQLCompteDAO() {
	}

	public static MySQLCompteDAO getInstance() {
		if (instance == null) {
			instance = new MySQLCompteDAO();
		}
		return instance;
	}

	@Override
	public void Create(Compte objet) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Update(Compte objet) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Delete(Compte objet) {
		// TODO Auto-generated method stub

	}
}
