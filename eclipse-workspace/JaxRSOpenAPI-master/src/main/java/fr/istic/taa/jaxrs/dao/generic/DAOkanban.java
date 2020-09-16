package fr.istic.taa.jaxrs.dao.generic;

import java.io.Serializable;
import java.util.List;

public class DAOkanban<K, T extends Serializable> implements IGenericDao<K, T> {

	@Override
	public T findOne(K id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T update(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(K entityId) {
		// TODO Auto-generated method stub
		
	}

}
