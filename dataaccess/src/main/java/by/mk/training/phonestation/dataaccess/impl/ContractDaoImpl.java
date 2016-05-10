package by.mk.training.phonestation.dataaccess.impl;

import org.springframework.stereotype.Repository;

import by.mk.training.phonestation.dataaccess.ContractDao;
import by.mk.training.phonestation.datamodel.Contract;

@Repository
public class ContractDaoImpl extends AbstractDaoImpl<Contract, Long> implements ContractDao {

	protected ContractDaoImpl() {
		super(Contract.class);
	}
}