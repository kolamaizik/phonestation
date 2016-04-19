package by.mk.training.phonestation.datamodel;

import javax.persistence.*;

@Entity(name = "services_2_contract")
public class ServiceContract {

	@ManyToOne(targetEntity = Service.class, fetch = FetchType.LAZY)
	private Service service;
	
	@ManyToOne(targetEntity = Contract.class, fetch = FetchType.LAZY)
	private Contract contract;

	@OneToMany(mappedBy = "service_2_contrakt", fetch = FetchType.LAZY)
	private UseDetail useDetail;

	@OneToMany(mappedBy = "service_2_contrakt", fetch = FetchType.LAZY)
	private Payment payment;

	@Column
	private Byte blocked;

	public UseDetail getUseDetail() {
		return useDetail;
	}

	public void setUseDetail(UseDetail useDetail) {
		this.useDetail = useDetail;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Byte getBlocked() {
		return blocked;
	}

	public void setBlocked(Byte blocked) {
		this.blocked = blocked;
	}
}
