package com.iut.as.interfaces;

public interface IDao<T> {

	public abstract void Create(T objet);

	public abstract void Update(T objet);

	public abstract void Delete(T objet);

}
