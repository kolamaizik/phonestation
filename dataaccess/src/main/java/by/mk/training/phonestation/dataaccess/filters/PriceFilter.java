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
    private SingularAttribute sortProperty;
    private boolean sortOrder;
    private Integer offset;
    private Integer limit;
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
	public SingularAttribute getSortProperty() {
		return sortProperty;
	}
	public void setSortProperty(SingularAttribute sortProperty) {
		this.sortProperty = sortProperty;
	}
	public boolean isSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(boolean sortOrder) {
		this.sortOrder = sortOrder;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
}