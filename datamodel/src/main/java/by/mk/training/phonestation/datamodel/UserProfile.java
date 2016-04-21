package by.mk.training.phonestation.datamodel;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
public class UserProfile extends AbstractModel {

	@MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(nullable = false, updatable = false, name = "id")
	private User user;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String address;
	
	@Column
	private int blocked;
	
	@Column
	private Date created;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
	private Set<Contract> contract;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
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

	public int getBlocked() {
		return blocked;
	}

	public void setBlocked(int blocked) {
		this.blocked = blocked;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
}
