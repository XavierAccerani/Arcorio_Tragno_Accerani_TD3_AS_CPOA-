package com.iut.as.daofactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.iut.as.connexion.Connexion;
import com.iut.as.interfaces.IDaoClient;
import com.iut.as.modele.Client;

public class MySQLClientDAO implements IDaoClient<Client> {

	private static MySQLClientDAO instance = null;

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
					.prepareStatement("INSERT INTO users (numeroClient, adresse, nom) VALUES(?,?,?)");
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
	public void Update(Client objet) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Delete(Client objet) {
		// TODO Auto-generated method stub

	}

}
