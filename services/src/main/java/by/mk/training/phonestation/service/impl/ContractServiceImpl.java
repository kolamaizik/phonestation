package by.mk.training.phonestation.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import by.mk.training.phonestation.dataaccess.ContractDao;
import by.mk.training.phonestation.datamodel.Contract;
import by.mk.training.phonestation.service.ContractService;

@Service
public class ContractServiceImpl implements ContractService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ContractServiceImpl.class);

	@Inject
	private ContractDao contractDao;

	@Override
	public void insert(Contract contract) {
		contractDao.insert(contract);

		LOGGER.info("ContractService inserted: {}", contract);
	}

	@Override
	public void update(Contract contract) {
		contractDao.update(contract);

		LOGGER.info("ContractService updated: {}", contract);
	}

	@Override
	public void delete(Long id) {
		contractDao.delete(id);

		LOGGER.info("ContractService deleted: {}", contractDao.get(id));
	}


	@Override
	public Contract getContract(Long id) {
		return null;
	}

	@Override
	public List<Contract> getAll() {
		return null;
	}
}