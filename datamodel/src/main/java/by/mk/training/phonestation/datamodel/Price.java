package by.mk.training.phonestation.datamodel;

import java.util.Date;

import javax.persistence.Column;

import java.math.BigDecimal;

public class Price extends AbstractModel {

	private Service service;
	@Column
	private Date dateBegin;
	@Column
	private Date dateEnd;
	@Column
	private BigDecimal price;
	private Measures measures;

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
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

	public Measures getMeasures() {
		return measures;
	}

	public void setMeasures(Measures measures) {
		this.measures = measures;
	}
}