package com.iut.as.daofactory;

import com.iut.as.interfaces.IDaoClient;

public class MySQLFactoryDAO extends DaoFactory {

	@Override
	public IDaoClient getDaoClient() {
		return MySQLClientDAO.getInstance();
	}

}
