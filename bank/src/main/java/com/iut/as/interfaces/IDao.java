package com.iut.as.interfaces;

import java.util.List;

public interface IDao<T> {
	
	public abstract void Create(T objet);
	public abstract void Update(T objet);
	public abstract void Delete(T objet);

}
