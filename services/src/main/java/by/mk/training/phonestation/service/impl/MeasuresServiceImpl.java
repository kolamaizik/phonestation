package by.mk.training.phonestation.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import by.mk.training.phonestation.dataaccess.MeasuresDao;
import by.mk.training.phonestation.datamodel.Measures;
import by.mk.training.phonestation.service.MeasuresService;

@Service
public class MeasuresServiceImpl implements MeasuresService {
	
	@Inject
	private MeasuresDao measuresDao;

	@Override
	public void insert(Measures measures) {
		measuresDao.insert(measures);
	}

	@Override
	public void update(Measures measures) {
		measuresDao.update(measures);
	}

	@Override
	public void delete(Long id) {
		measuresDao.delete(id);
	}

	@Override
	public Measures getMeasures(Long id) {
		return null;
	}

	@Override
	public List<Measures> getAll() {
		return measuresDao.getAll();
	}
}