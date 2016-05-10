package by.mk.training.phonestation.service;

import java.util.List;

import javax.transaction.Transactional;

import by.mk.training.phonestation.datamodel.Price;

public interface PriceService {
	
	@Transactional
	void insert(Price price);

	@Transactional
	void update(Price price);

	@Transactional
	void delete(Long id);

	Price getPrice(Long id);

	List<Price> getAll();
}
