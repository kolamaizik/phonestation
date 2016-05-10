package by.mk.training.phonestation.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import by.mk.training.phonestation.dataaccess.MeasureDao;
import by.mk.training.phonestation.datamodel.Measure;
import by.mk.training.phonestation.service.MeasureService;

@Service
public class MeasureServiceImpl implements MeasureService {

	private static final Logger LOGGER = LoggerFactory.getLogger(MeasureServiceImpl.class);

	@Inject
	private MeasureDao measuresDao;

	@Override
	public void insert(Measure measure) {
		measuresDao.insert(measure);

		LOGGER.info("Measure inserted: {}", measure);
	}

	@Override
	public void update(Measure measure) {
		measuresDao.update(measure);

		LOGGER.info("Measure updated: {}", measure);
	}

	@Override
	public void delete(Long id) {
		measuresDao.delete(id);

		LOGGER.info("Measure deleted: {}", measuresDao.get(id));
	}

	@Override
	public Measure getMeasure(Long id) {
		return measuresDao.get(id);
	}

	@Override
	public List<Measure> getAll() {
		return measuresDao.getAll();
	}
}