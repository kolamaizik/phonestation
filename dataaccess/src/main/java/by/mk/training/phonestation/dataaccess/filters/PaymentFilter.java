package by.mk.training.phonestation.dataaccess.filters;

import java.math.BigDecimal;
import java.util.Date;

public class PaymentFilter {

	private BigDecimal totalSum;
	private Date datePayment;
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

	public Boolean getPaid() {
		return paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}
}