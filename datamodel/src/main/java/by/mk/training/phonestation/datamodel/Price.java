package by.mk.training.phonestation.datamodel;

import java.util.Date;

import javax.persistence.*;

import java.math.BigDecimal;

@Entity
public class Price extends AbstractModel {

	@ManyToOne(targetEntity = Services.class, fetch = FetchType.LAZY)
	private Services service;

	@Column
	private Date dateBegin;

	@Column
	private Date dateEnd;

	@Column
	private BigDecimal price;

	@ManyToOne(targetEntity = Measure.class, fetch = FetchType.LAZY)
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