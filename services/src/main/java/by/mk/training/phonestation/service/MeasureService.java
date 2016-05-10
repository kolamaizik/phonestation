package by.mk.training.phonestation.service;

import java.util.List;

import javax.transaction.Transactional;

import by.mk.training.phonestation.datamodel.Measure;

public interface MeasureService {

	@Transactional
	void insert(Measure measures);

	@Transactional
	void update(Measure measures);

	@Transactional
	void delete(Long id);

	Measure getMeasure(Long id);

	List<Measure> getAll();
}