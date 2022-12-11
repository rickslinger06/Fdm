package com.fdmgroup.data;

import java.util.List;
import java.util.Optional;

public interface Persistable<T, U> {

	T create(T t);
	List<T> readAll();
	Optional<T> read(U u);
	T update(T t);
	void delete(U u);
}
