package by.mk.training.phonestation.datamodel;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Services extends AbstractModel {

	@Column
	private String name;

	@OneToMany(mappedBy = "service", fetch = FetchType.LAZY)
	private List<ServiceContract> serviceContract;

	@Column
	private Date lockDate;

	@OneToMany(mappedBy = "service", fetch = FetchType.LAZY)
	private List<Price> price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ServiceContract> getServiceContract() {
		return serviceContract;
	}

	public void setServiceContract(List<ServiceContract> serviceContract) {
		this.serviceContract = serviceContract;
	}

	public Date getLockDate() {
		return lockDate;
	}

	public void setLockDate(Date lockDate) {
		this.lockDate = lockDate;
	}

	public List<Price> getPrice() {
		return price;
	}

	public void setPrice(List<Price> price) {
		this.price = price;
	}
}