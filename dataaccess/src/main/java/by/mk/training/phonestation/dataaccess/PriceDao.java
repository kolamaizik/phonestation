package by.mk.training.phonestation.dataaccess;

import java.sql.SQLException;

import by.mk.training.phonestation.datamodel.Price;

public interface PriceDao {
	public void addPrice(Price price) throws SQLException;
	public void updPrice(Price price) throws SQLException;
	public Price getPriceById(Long bus_id) throws SQLException;
}
