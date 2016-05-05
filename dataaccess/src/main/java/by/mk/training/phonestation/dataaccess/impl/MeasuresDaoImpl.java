package by.mk.training.phonestation.dataaccess.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import by.mk.training.phonestation.dataaccess.MeasuresDao;
import by.mk.training.phonestation.dataaccess.filters.UserFilter;
import by.mk.training.phonestation.datamodel.Measures;

@Repository
public class MeasuresDaoImpl extends AbstractDaoImpl<Measures, Long> implements MeasuresDao {
	
	protected MeasuresDaoImpl() {
		super(Measures.class);
	}

	@Override
	public List<Measures> find(UserFilter filter) {
		return null;
	}
}