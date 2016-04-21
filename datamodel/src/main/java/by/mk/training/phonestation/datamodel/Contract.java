package by.mk.training.phonestation.datamodel;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Column;

@Entity
public class Contract extends AbstractModel {

	@ManyToOne(targetEntity = UserProfile.class, fetch = FetchType.LAZY)
	private UserProfile user;

	@Column
	private int phoneNumber;

	@Column
	private Date dateBegin;

	@Column
	private Date dateEnd;

	@OneToMany(mappedBy = "contract", fetch = FetchType.LAZY)
	private Set<ServiceContract> serviceContract;

	public UserProfile getUser() {
		return user;
	}

	public void setUser(UserProfile user) {
		this.user = user;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDateBegin() {
		return dateBegin;
	}

	public void setDateBegin(Date dateBegin) {
		this.dateBegin = dateBegin;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public Set<ServiceContract> getServiceContract() {
		return serviceContract;
	}

	public void setServiceContract(Set<ServiceContract> serviceContract) {
		this.serviceContract = serviceContract;
	}
}