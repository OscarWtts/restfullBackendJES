package com.jes.restfull.commons;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public abstract class GenericServiceImpl<T, ID extends Serializable> implements GenericService<T, ID> {

	@Override
	public List<T> getAll() {

		List<T> listToReturn = new ArrayList<T>();
		getRepository().findAll().forEach(item -> listToReturn.add(item));

		return listToReturn;
	}

	@Override
	public T get(ID id) {

		Optional<T> entity = getRepository().findById(id);
		if (entity.isPresent())
			return entity.get();

		return null;
	}

	@Override
	public T save(T entity) {
		return getRepository().save(entity);
	}

	@Override
	public void delete(ID id) {
		getRepository().deleteById(id);
	}

	public abstract CrudRepository<T, ID> getRepository();

}
