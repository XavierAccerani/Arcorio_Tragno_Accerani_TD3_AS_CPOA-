package com.iut.as.connexion;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class Connexion {

	private static Connection maConnexion;

	public static Connection creeConnexion() {
		try {
			if (maConnexion == null || maConnexion.isClosed()) {
				/** Lecture du fichier contenant les infos de connexion à la Bdd */
				Properties accessBdd = new Properties();
				File fBdd = new File("config/bdd.properties");

				try {
					FileInputStream source = new FileInputStream(fBdd);
					accessBdd.loadFromXML(source);
				} catch (IOException ioe) {
					System.out.println("Erreur de lecture de fichier : " + ioe.getMessage());
				}

				String url = "jdbc:mysql://" + accessBdd.getProperty("adresse_ip") + ":" + accessBdd.getProperty("port")
						+ "/" + accessBdd.getProperty("bdd");
				String login = accessBdd.getProperty("login");
				String pass = accessBdd.getProperty("pass");

				maConnexion = DriverManager.getConnection(url, login, pass);

			}
		} catch (SQLException sqle) {
			System.out.println("Erreur connexion : " + sqle.getMessage());
		}
		return maConnexion;
	}
}