package com.uvsq.colinebintou.projet.dao;

public interface DAO<T> {
	T create(T obj);
	T find(T obj);
	T update(T obj);
	void delete(T obj);
}
