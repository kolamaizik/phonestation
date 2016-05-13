package by.mk.training.phonestation.dataaccess.impl;

import org.springframework.stereotype.Repository;

import by.mk.training.phonestation.dataaccess.ServiceContractDao;
import by.mk.training.phonestation.datamodel.ServiceContract;

@Repository
public class ServiceContractDaoImpl extends AbstractDaoImpl<ServiceContract, Long> implements ServiceContractDao {

	protected ServiceContractDaoImpl() {
		super(ServiceContract.class);
	}
}