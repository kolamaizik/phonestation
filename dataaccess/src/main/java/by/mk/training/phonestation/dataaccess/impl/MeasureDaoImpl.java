package by.mk.training.phonestation.dataaccess.impl;

import org.springframework.stereotype.Repository;

import by.mk.training.phonestation.dataaccess.MeasureDao;
import by.mk.training.phonestation.datamodel.Measure;

@Repository
public class MeasureDaoImpl extends AbstractDaoImpl<Measure, Long> implements MeasureDao {
	
	protected MeasureDaoImpl() {
		super(Measure.class);
	}

//	@Override
//	public List<Measure> find(MeasureFilter filter) {
//		return null;
//	}
}