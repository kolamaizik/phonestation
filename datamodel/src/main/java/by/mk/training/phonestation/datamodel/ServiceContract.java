package by.mk.training.phonestation.datamodel;

import javax.persistence.Column;

@Entity(name = "services_2_contract")
public class ServiceContract {

	@ManyToOne(targetEntity = Service.class, fetch = FetchType.LAZY)
	private Service service;
	
	@ManyToOne(targetEntity = Contract.class, fetch = FetchType.LAZY)
	private Contract contract;

	@Column
	private Byte blocked;

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public Byte getBlocked() {
		return blocked;
	}

	public void setBlocked(Byte blocked) {
		this.blocked = blocked;
	}
}
