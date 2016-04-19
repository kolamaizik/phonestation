package by.mk.training.phonestation.datamodel;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Column;

@Entity
public class Payment extends AbstractModel {

	@Column
	private BigDecimal totalSum;

	@Column
	private Date datePayment;

	@Column
	private BigDecimal paySum;

	@Column
	private Date period;

	@Column
	private Boolean paid;

	@ManyToOne(targetEntity = ServiceContract.class, fetch = FetchType.LAZY)
	private ServiceContract serviceContractId;

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

	public Boolean getPaid() {
		return paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

	public ServiceContract getServiceContractId() {
		return serviceContractId;
	}

	public void setServiceContractId(ServiceContract serviceContractId) {
		this.serviceContractId = serviceContractId;
	}
}