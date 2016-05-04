package by.mk.training.phonestation.dataaccess.impl;

import java.util.List;

import by.mk.training.phonestation.dataaccess.MeasuresDao;
import by.mk.training.phonestation.dataaccess.filters.UserFilter;
import by.mk.training.phonestation.datamodel.Measures;

public class MeasuresDaoImpl extends AbstractDaoImpl<Measures, Long> implements MeasuresDao {

	protected MeasuresDaoImpl(Class<Measures> entityClass) {
		super(entityClass);
	}

	@Override
	public List<Measures> find(UserFilter filter) {
		return null;
	}
}