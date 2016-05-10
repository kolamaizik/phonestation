package by.mk.training.phonestation.service;

import java.util.List;

import javax.transaction.Transactional;

import by.mk.training.phonestation.datamodel.Contract;

public interface ContractService {
	@Transactional
	void insert(Contract contract);

	@Transactional
	void update(Contract contract);

	@Transactional
	void delete(Long id);

	Contract getContract(Long id);

	List<Contract> getAll();
}