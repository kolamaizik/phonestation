package by.mk.training.phonestation.datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "services_2_contract")
public class ServiceContract {

	@OneToMany(mappedBy = "service_2_contrakt_id", fetch = FetchType.LAZY)
	private UseDetail useDetail;

	@OneToMany(mappedBy = "service_2_contrakt_id", fetch = FetchType.LAZY)
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
