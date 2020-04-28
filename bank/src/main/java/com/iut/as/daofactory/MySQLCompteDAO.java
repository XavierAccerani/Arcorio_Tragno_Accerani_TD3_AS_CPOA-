package com.iut.as.daofactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.iut.as.connexion.Connexion;
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
	public void Create(Compte compte) {
		try {
			Connection laConnexion = Connexion.creeConnexion();
			PreparedStatement requete = laConnexion
					.prepareStatement("INSERT INTO compte (numeroCompte, solde) VALUES(?,?)");
			requete.setString(1, compte.getNumeroCompte());
			requete.setDouble(2, compte.getSolde());
			requete.executeUpdate();
			if (laConnexion != null)
				laConnexion.close();
		} catch (SQLException sqle) {
			System.out.println("Probleme select" + sqle.getMessage());
		}
	}

	@Override
	public void Update(Compte compte) {
		try {
			Connection laConnexion = Connexion.creeConnexion();
			PreparedStatement requete = laConnexion.prepareStatement("UPDATE compte SET solde=? WHERE numeroCompte=?");
			requete.setDouble(1, compte.getSolde());
			requete.setString(2, compte.getNumeroCompte());
			requete.executeUpdate();
			if (laConnexion != null)
				laConnexion.close();
		} catch (SQLException sqle) {
			System.out.println("Pb de màj de la BdD " + sqle.getMessage());
		}
	}

	@Override
	public void Delete(Compte compte) {
		try {
			Connection laConnexion = Connexion.creeConnexion();
			PreparedStatement requete = laConnexion.prepareStatement("DELETE FROM compte WHERE numeroCompte=?");
			requete.setString(1, compte.getNumeroCompte());
			requete.executeUpdate();
			if (laConnexion != null)
				laConnexion.close();
		} catch (SQLException sqle) {
			System.out.println("Pb de màj de la Bdd " + sqle.getMessage());
		}
	}
}
