package by.mk.training.phonestation.datamodel;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

public class Service extends AbstractModel {
	
	@Column
	private String name;
	
	@JoinTable(name = "service_2_contract", joinColumns = {@JoinColumn(name = "service_id") }, inverseJoinColumns = { @JoinColumn(name = "contract_id") })
    @ManyToMany(targetEntity = Contract.class, fetch = FetchType.LAZY)
	private Set<Contract> contract;
	
	@Column
	private Date dateEnd;
	
	public String getName() {
		return name;
	} 

	public void setName(String name) {
		this.name = name;
	}

	public Set<Contract> getContract() {
		return contract;
	}

	public void setContract(Set<Contract> contract) {
		this.contract = contract;
	}

	public Date getDateBlocked() {
		return dateEnd;
	}

	public void setDateBlocked(Date dateBlocked) {
		this.dateEnd = dateBlocked;
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