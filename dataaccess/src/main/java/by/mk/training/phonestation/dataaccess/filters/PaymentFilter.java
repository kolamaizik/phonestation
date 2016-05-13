package by.mk.training.phonestation.dataaccess.filters;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.metamodel.SingularAttribute;

import by.mk.training.phonestation.datamodel.UserCredentials;
import by.mk.training.phonestation.datamodel.UserProfile;

public class PaymentFilter {

	private BigDecimal totalSum;
	private Date datePayment;
	private Boolean paid;

	private SingularAttribute sortProperty;
	private boolean sortOrder;
	private Integer offset;
	private Integer limit;

	public BigDecimal getTotalSum() {
		return totalSum;
	}
	public void setTotalSum(BigDecimal totalSum) {
		this.totalSum = totalSum;
	}
	public Date getDatePayment() {
		return datePayment;
	}
	public void setDatePayment(Date datePayment) {
		this.datePayment = datePayment;
	}
	public Boolean getPaid() {
		return paid;
	}
	public void setPaid(Boolean paid) {
		this.paid = paid;
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