package by.mk.training.phonestation.dataaccess.impl;

import by.mk.training.phonestation.dataaccess.ServiceContractDao;
import by.mk.training.phonestation.datamodel.Service;

public class ServiceContractDaoImpl extends AbstractDaoImpl<Service, Long> implements ServiceContractDao {

	protected ServiceContractDaoImpl(Class<Service> entityClass) {
		super(entityClass);
	}
}
