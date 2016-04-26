package by.mk.training.phonestation.dataaccess.impl;

import by.mk.training.phonestation.dataaccess.ServiceContractDao;
import by.mk.training.phonestation.datamodel.ServiceContract;

public class ServiceContractDaoImpl extends AbstractDaoImpl<ServiceContract, Long> implements ServiceContractDao {

	protected ServiceContractDaoImpl(Class<ServiceContract> entityClass) {
		super(entityClass);
	}

}
