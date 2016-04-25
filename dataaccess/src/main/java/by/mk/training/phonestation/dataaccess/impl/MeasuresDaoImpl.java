package by.mk.training.phonestation.dataaccess.impl;

import by.mk.training.phonestation.dataaccess.MeasuresDao;
import by.mk.training.phonestation.datamodel.Measures;

public class MeasuresDaoImpl extends AbstractDaoImpl<Measures, Long> implements MeasuresDao {

	protected MeasuresDaoImpl(Class<Measures> entityClass) {
		super(entityClass);
	}
}