package by.mk.training.phonestation.dataaccess.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import by.mk.training.phonestation.dataaccess.MeasureDao;
import by.mk.training.phonestation.dataaccess.filters.UserFilter;
import by.mk.training.phonestation.datamodel.Measure;

@Repository
public class MeasureDaoImpl extends AbstractDaoImpl<Measure, Long> implements MeasureDao {
	
	protected MeasureDaoImpl() {
		super(Measure.class);
	}

//	@Override
//	public List<Measures> find(MeasuresFilter filter) {
//		return null;
//	}
}