package by.mk.training.phonestation.service;

import java.util.List;

import javax.transaction.Transactional;

import by.mk.training.phonestation.datamodel.Services;

public interface ServiceService {

	@Transactional
	void insert(Services service);

	@Transactional
	void update(Services service);

	@Transactional
	void delete(Long id);

	@Transactional
	void deleteByName(String name);

	Services getServices(Long id);
	List<Services> getSerByName(String name);
	List<Services> getAll();
}
