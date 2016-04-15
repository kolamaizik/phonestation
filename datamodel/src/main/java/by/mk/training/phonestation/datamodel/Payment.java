package by.mk.training.phonestation.datamodel;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;

public class Payment extends AbstractModel {

	@Column
	private BigDecimal totalSum;
	@Column
	private Date datePayment;
	@Column
	private BigDecimal paySum;
	@Column
	private Date period;
	private ServiceContract serviceContract;
	@Column
	private Boolean paid;

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

	public BigDecimal getPaySum() {
		return paySum;
	}

	public void setPaySum(BigDecimal paySum) {
		this.paySum = paySum;
	}

	public Date getPeriod() {
		return period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public ServiceContract getServiceContract() {
		return serviceContract;
	}

	public void setServiceContract(ServiceContract serviceContract) {
		this.serviceContract = serviceContract;
	}

	public Boolean getPaid() {
		return paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}
}