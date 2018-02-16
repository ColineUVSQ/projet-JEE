package com.uvsq.colinebintou.projet.dao;

public interface DAO<T> {
	T create(T obj);
	T findbyId(int id);
	T update(T obj);
	void delete(T obj);
}
