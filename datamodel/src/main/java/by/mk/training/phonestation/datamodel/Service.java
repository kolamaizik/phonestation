package by.mk.training.phonestation.datamodel;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;

public class Service extends AbstractModel {
	
	@Column
	private String name;
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
}