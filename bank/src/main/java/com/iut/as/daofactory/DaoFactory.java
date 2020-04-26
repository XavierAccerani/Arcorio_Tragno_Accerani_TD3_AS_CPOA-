package com.iut.as.daofactory;

import com.iut.as.enumeration.EPersistance;

public abstract class DaoFactory {
	
	/* @return 'une dao' qui correspond au type de la base de données. */
	public static DaoFactory getDaoFactory(EPersistance type) {
		DaoFactory daoF = null;
		switch (type) {
		case XML:
			throw new UnsupportedOperationException();
		case SQL:
			throw new UnsupportedOperationException();
		default:
			break;
		}
		return daoF;
	}

	public abstract IDaoClient getDaoClient();
}

