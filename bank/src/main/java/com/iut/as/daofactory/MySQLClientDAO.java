package com.iut.as.daofactory;

import com.iut.as.interfaces.IDaoClient;
import com.iut.as.modele.Client;

public class MySQLClientDAO implements IDaoClient<Client> {

	private static MySQLClientDAO instance;
	
	private MySQLClientDAO() {}
	
	public static MySQLClientDAO getInstance() {
		if(instance == null) {
			instance = new MySQLClientDAO();
		}
		return instance;
	}

	@Override
	public void Create(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete(Client client) {
		// TODO Auto-generated method stub
		
	}
}
