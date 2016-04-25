package by.mk.training.phonestation.dataaccess.impl;

import by.mk.training.phonestation.dataaccess.ContractDao;
import by.mk.training.phonestation.datamodel.Contract;

public class ContractDaoImpl extends AbstractDaoImpl<Contract, Long> implements ContractDao {

	protected ContractDaoImpl(Class<Contract> entityClass) {
		super(entityClass);
	}
}