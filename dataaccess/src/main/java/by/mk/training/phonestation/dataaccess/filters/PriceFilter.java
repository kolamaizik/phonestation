package by.mk.training.phonestation.dataaccess.filters;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.metamodel.SingularAttribute;

import by.mk.training.phonestation.datamodel.Measure;
import by.mk.training.phonestation.datamodel.Services;

public class PriceFilter {

	private Services service;
	private Date dateBegin;
	private Date dateEnd;
	private BigDecimal price;
	private Measure measure;

	public Services getService() {
		return service;
	}

	public void setService(Services service) {
		this.service = service;
	}

	public Date getDateBegin() {
		return dateBegin;
	}

	public void setDateBegin(Date dateBegin) {
		this.dateBegin = dateBegin;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Measure getMeasure() {
		return measure;
	}

	public void setMeasure(Measure measure) {
		this.measure = measure;
	}
}