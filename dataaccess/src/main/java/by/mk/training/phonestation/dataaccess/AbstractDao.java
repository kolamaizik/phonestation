package by.mk.training.phonestation.dataaccess;

import java.util.List;

import javax.persistence.TypedQuery;

import by.mk.training.phonestation.dataaccess.filters.AbstractFilter;
import by.mk.training.phonestation.datamodel.AbstractModel;

public interface AbstractDao<T, ID> {

	List<T> getAll();

	T get(final ID id);

	T insert(final T entity);

	T update(T entity);

	void delete(ID id);

}