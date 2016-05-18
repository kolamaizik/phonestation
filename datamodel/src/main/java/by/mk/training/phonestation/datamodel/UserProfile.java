package by.mk.training.phonestation.datamodel;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class UserProfile extends AbstractModel implements Serializable {

	@MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(nullable = false, updatable = false, name = "id")
	private UserCredentials user;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String address;
	
	@Column
	private boolean blocked;
	
	@Column
	private Date created;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
	private List<Contract> contract;

	public UserCredentials getUser() {
		return user;
	}

	public void setUser(UserCredentials user) {
		this.user = user;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public List<Contract> getContract() {
		return contract;
	}

	public void setContract(List<Contract> contract) {
		this.contract = contract;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
}
