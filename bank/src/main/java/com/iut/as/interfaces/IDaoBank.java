package com.iut.as.interfaces;

import java.util.List;

public interface IDaoBank<T> extends IDao<T> {

	public abstract void OuvertureCompte(String nom_client);

}
