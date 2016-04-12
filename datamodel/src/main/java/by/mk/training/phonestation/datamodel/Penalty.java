package by.mk.training.phonestation.datamodel;

public class Penalty extends AbstractModel {
	private Payment payment;
	private Double percent;
	private Double sumNoPay;

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment paymentId) {
		this.payment = paymentId;
	}

	public Double getPercent() {
		return percent;
	}

	public void setPercent(Double percent) {
		this.percent = percent;
	}

	public Double getSumNoPay() {
		return sumNoPay;
	}

	public void setSumNoPay(Double sumNoPay) {
		this.sumNoPay = sumNoPay;
	}
}
