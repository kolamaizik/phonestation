package by.mk.training.phonestation.datamodel;

import java.math.BigDecimal;

public class Penalty extends AbstractModel {

	private Payment payment;
	private Double percent;
	private BigDecimal sumNoPay;

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Double getPercent() {
		return percent;
	}

	public void setPercent(Double percent) {
		this.percent = percent;
	}

	public BigDecimal getSumNoPay() {
		return sumNoPay;
	}

	public void setSumNoPay(BigDecimal sumNoPay) {
		this.sumNoPay = sumNoPay;
	}
}
