package com.iut.as.daofactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.iut.as.connexion.Connexion;

import com.iut.as.interfaces.IDaoClient;
import com.iut.as.modele.Client;

public class MySQLClientDAO implements IDaoClient<Client> {

	private static MySQLClientDAO instance;

	private MySQLClientDAO() {
	}

	public static MySQLClientDAO getInstance() {
		if (instance == null) {
			instance = new MySQLClientDAO();
		}
		return instance;
	}

	@Override
	public void Create(Client client) {
		try {
			Connection laConnexion = Connexion.creeConnexion();
			PreparedStatement requete = laConnexion
					.prepareStatement("INSERT INTO client (numeroClient, adresse, nom) VALUES(?,?,?)");
			requete.setString(1, client.getNumeroClient());
			requete.setString(2, client.getAdresse());
			requete.setString(3, client.getNom());
			requete.executeUpdate();
			if (laConnexion != null)
				laConnexion.close();
		} catch (SQLException sqle) {
			System.out.println("Probleme select" + sqle.getMessage());
		}
	}

	@Override
	public void Update(Client client) {
		try {
			Connection laConnexion = Connexion.creeConnexion();
			PreparedStatement requete = laConnexion
					.prepareStatement("UPDATE client SET nom=?, prenom=? WHERE numeroClient=?");
			requete.setString(1, client.getNumeroClient());
			requete.setString(2, client.getAdresse());
			requete.setString(3, client.getNom());
			requete.executeUpdate();
			if (laConnexion != null)
				laConnexion.close();
		} catch (SQLException sqle) {
			System.out.println("Pb de màj de la BdD " + sqle.getMessage());
		}
	}

	@Override
	public void Delete(Client client) {
		try {
			Connection laConnexion = Connexion.creeConnexion();

			PreparedStatement requete = laConnexion.prepareStatement("DELETE FROM client WHERE numeroClient=?");
			requete.setString(1, client.getNumeroClient());
			requete.executeUpdate();
			if (laConnexion != null)
				laConnexion.close();
		} catch (SQLException sqle) {
			System.out.println("Pb de màj de la Bdd " + sqle.getMessage());
		}
	}

}
