package com.iut.as.interfaces;

import java.util.List;

public interface IDao<T> {
	
	T read(int id);

	List<T> getList();
}
