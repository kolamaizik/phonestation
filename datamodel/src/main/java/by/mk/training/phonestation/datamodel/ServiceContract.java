package by.mk.training.phonestation.datamodel;

import java.util.List;
import javax.persistence.*;

@Entity(name = "services_2_contract")
public class ServiceContract extends AbstractModel {

	@ManyToOne(targetEntity = Service.class, fetch = FetchType.LAZY)
	private Service service;

	@ManyToOne(targetEntity = Contract.class, fetch = FetchType.LAZY)
	private Contract contract;

	@OneToMany(mappedBy = "serviceContract", fetch = FetchType.LAZY)
	private List<UseDetail> useDetail;

	@OneToMany(mappedBy = "serviceContract", fetch = FetchType.LAZY)
	private List<Payment> payment;

	@Column
	private Byte blocked;

	public Byte getBlocked() {
		return blocked;
	}

	public void setBlocked(Byte blocked) {
		this.blocked = blocked;
	}
}
