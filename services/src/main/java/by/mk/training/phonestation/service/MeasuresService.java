package by.mk.training.phonestation.service;

import java.util.List;

import javax.transaction.Transactional;

import by.mk.training.phonestation.datamodel.Measures;

public interface MeasuresService {

	@Transactional
	void insert(Measures measures);

	@Transactional
	void update(Measures measures);

	@Transactional
	void delete(Long id);

	Measures getMeasures(Long id);

	List<Measures> getAll();
}