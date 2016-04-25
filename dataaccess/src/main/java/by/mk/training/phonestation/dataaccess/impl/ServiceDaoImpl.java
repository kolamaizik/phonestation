package by.mk.training.phonestation.dataaccess.impl;

import by.mk.training.phonestation.dataaccess.ServiceDao;
import by.mk.training.phonestation.datamodel.Service;

public class ServiceDaoImpl extends AbstractDaoImpl<Service, Long> implements ServiceDao {

	protected ServiceDaoImpl(Class<Service> entityClass) {
		super(entityClass);
	}
}
