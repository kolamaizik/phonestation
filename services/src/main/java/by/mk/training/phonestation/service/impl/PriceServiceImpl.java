package by.mk.training.phonestation.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import by.mk.training.phonestation.dataaccess.PriceDao;
import by.mk.training.phonestation.datamodel.Price;
import by.mk.training.phonestation.service.PriceService;

@Service
public class PriceServiceImpl implements PriceService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PriceServiceImpl.class);

	@Inject
	private PriceDao priceDao;

	@Override
	public void insert(Price price) {
		priceDao.insert(price);
		
		LOGGER.info("Price inserted: {}", price);
	}

	@Override
	public void update(Price price) {
		priceDao.update(price);

		LOGGER.info("Price updated: {}", price);
	}

	@Override
	public void delete(Long id) {
		priceDao.delete(id);
		
		LOGGER.info("Price deleted: {}", priceDao.get(id));
	}

	@Override
	public Price getPrice(Long id) {
		return priceDao.get(id);
	}

	@Override
	public List<Price> getAll() {
		return priceDao.getAll();
	}
}