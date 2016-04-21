package by.mk.training.phonestation.datamodel;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Service extends AbstractModel {

	@Column
	private String name;

	@OneToMany(mappedBy = "service", fetch = FetchType.LAZY)
	private Set<ServiceContract> serviceContract;

	@Column
	private Date dateEnd;

	private Price price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<ServiceContract> getServiceContract() {
		return serviceContract;
	}

	public void setServiceContract(Set<ServiceContract> serviceContract) {
		this.serviceContract = serviceContract;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}
}