package com.jes.restfull.commons;

import java.io.Serializable;
import java.util.List;

public interface GenericService<T, ID extends Serializable> {

	List<T> getAll();

	T get(ID id);

	T save(T entity);

	void delete(ID id);

}
