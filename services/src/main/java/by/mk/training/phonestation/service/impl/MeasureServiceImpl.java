package by.mk.training.phonestation.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import by.mk.training.phonestation.dataaccess.MeasureDao;
import by.mk.training.phonestation.datamodel.Measure;
import by.mk.training.phonestation.service.LogTest;
import by.mk.training.phonestation.service.MeasuresService;

@Service
public class MeasureServiceImpl implements MeasuresService {

	private static final Logger LOGGER = LoggerFactory.getLogger(LogTest.class);

	@Inject
	private MeasureDao measuresDao;

	@Override
	public void insert(Measure measures) {
		measuresDao.insert(measures);

		LOGGER.warn("Measure inserted: {}", measures);
	}

	@Override
	public void update(Measure measures) {
		measuresDao.update(measures);

		LOGGER.warn("Measure updated: {}", measures);
	}

	@Override
	public void delete(Long id) {
		measuresDao.delete(id);

		LOGGER.warn("Measure deleted: {}", measuresDao.get(id));
	}

	@Override
	public Measure getMeasures(Long id) {
		return measuresDao.get(id);
	}

	@Override
	public List<Measure> getAll() {
		return measuresDao.getAll();
	}
}