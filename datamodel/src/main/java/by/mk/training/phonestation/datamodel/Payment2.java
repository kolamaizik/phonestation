package by.mk.training.phonestation.datamodel;

import java.math.BigDecimal;
import java.util.Date;

public class Payment2 extends AbstractModel {
	private BigDecimal totalSum;
	private Date datePayment;
	private BigDecimal paySum;
	private Date period;

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
}