package by.mk.training.phonestation.dataaccess.impl;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import by.mk.training.phonestation.dataaccess.PriceDao;
import by.mk.training.phonestation.datamodel.Price;

@Repository
public class PriceDaoImpl extends AbstractDaoImpl<Price, Long> implements PriceDao {

	protected PriceDaoImpl() {
		super(Price.class);
	}
}