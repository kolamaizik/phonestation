package by.mk.training.phonestation.dataaccess.impl;

import java.sql.SQLException;

import by.mk.training.phonestation.dataaccess.PriceDao;
import by.mk.training.phonestation.datamodel.Price;

public class PriceDaoImpl extends AbstractDaoImpl<Price, Long> implements PriceDao {

	protected PriceDaoImpl(Class<Price> entityClass) {
		super(entityClass);
	}

	@Override
	public void addPrice(Price price) throws SQLException {

	}

	@Override
	public void updPrice(Price price) throws SQLException {

	}

	@Override
	public Price getPriceById(Long bus_id) throws SQLException {
		return null;
	}
}