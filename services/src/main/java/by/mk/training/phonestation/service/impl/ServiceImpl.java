package by.mk.training.phonestation.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import by.mk.training.phonestation.dataaccess.ServiceDao;
import by.mk.training.phonestation.datamodel.Services;
import by.mk.training.phonestation.service.ServiceService;

@Service
public class ServiceImpl implements ServiceService {
	//private static final Logger LOGGER = LoggerFactory.getLogger(LogTest.class);

	@Inject
	private ServiceDao serviceDao;

	@Override
	public void insert(Services service) {
		serviceDao.insert(service);

		//LOGGER.info("Services inserted: {}", service);
	}

	@Override
	public void update(Services service) {
		serviceDao.update(service);

		//LOGGER.info("Services updated: {}", service);
	}

	@Override
	public void delete(Long id) {
		serviceDao.delete(id);

		//LOGGER.info("Services deleted: {}", serviceDao.get(id));
	}

	@Override
	public Services getServices(Long id) {
		return serviceDao.get(id);
	}

	@Override
	public List<Services> getAll() {
		return serviceDao.getAll();
	}
}