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
					.prepareStatement("INSERT INTO Compte (solde, numeroCompte) VALUES(?,?)");
			requete.setDouble(1, compte.getSolde());
			requete.setString(2, compte.getNumeroCompte());
			requete.executeUpdate();
			if (laConnexion != null)
				laConnexion.close();
		} catch (SQLException sqle) {
			System.out.println("Problème dans le Select " + sqle.getMessage());
		}
	}

	@Override
	public void Update(Compte compte) {
		try {
			Connection laConnexion = Connexion.creeConnexion();
			PreparedStatement requete = laConnexion.prepareStatement("UPDATE Compte SET solde=? WHERE numeroCompte=?");
			requete.setDouble(1, compte.getSolde());
			requete.setString(2, compte.getNumeroCompte());
			requete.executeUpdate();
			if (laConnexion != null)
				laConnexion.close();
		} catch (SQLException sqle) {
			System.out.println("Problème d'update de la BdD " + sqle.getMessage());
		}
	}

	@Override
	public void Delete(Compte compte) {
		try {
			Connection laConnexion = Connexion.creeConnexion();
			PreparedStatement requete = laConnexion.prepareStatement("DELETE FROM Compte WHERE numeroCompte=?");
			requete.setString(1, compte.getNumeroCompte());
			requete.executeUpdate();
			if (laConnexion != null)
				laConnexion.close();
		} catch (SQLException sqle) {
			System.out.println("Problème d'update de la BdD " + sqle.getMessage());
		}
	}
}
