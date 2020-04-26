package com.iut.as.factory;

import java.util.ArrayList;
import java.util.List;

import com.iut.as.modele.Client;

public class ClientFactory {
	
	private static List<Client> clients;

	public static List<Client> getListClients() {
		if (clients == null) {
			clients = getList();
		}
		return clients;
	}

	private static List<Client> getList() {
		List<Client> clients = new ArrayList<>();
		// ici je construit un client --> Je porrai le déléguer à une autre factory ..
		Client client1 = new Client();
		client1.setNom("Louis");
		client1.setAdresse("1 rue des fleures, Metz");
		client1.setNumeroClient("1234");
		
		return clients;
	}


}
