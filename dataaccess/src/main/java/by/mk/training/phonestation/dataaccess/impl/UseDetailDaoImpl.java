package by.mk.training.phonestation.dataaccess.impl;

import by.mk.training.phonestation.dataaccess.UseDetailDao;
import by.mk.training.phonestation.datamodel.UseDetail;

public class UseDetailDaoImpl extends AbstractDaoImpl<UseDetail, Long> implements UseDetailDao {

	protected UseDetailDaoImpl() {
		super(UseDetail.class);
	}
}
