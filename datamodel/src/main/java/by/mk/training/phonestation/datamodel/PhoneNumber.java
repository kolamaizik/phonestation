package by.mk.training.phonestation.datamodel;

import java.util.List;
import java.util.Set;

public class PhoneNumber extends AbstractModel {

	private int phoneNumber;
	private UserProfile user;
	private Ats ats;
	private Byte blocked;
	private Set<Service> service;

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public UserProfile getUser() {
		return user;
	}

	public void setUser(UserProfile user) {
		this.user = user;
	}

	public Ats getAts() {
		return ats;
	}

	public void setAts(Ats ats) {
		this.ats = ats;
	}

	public Byte getBlocked() {
		return blocked;
	}

	public void setBlocked(Byte blocked) {
		this.blocked = blocked;
	}

	public List<Service> getService() {
		return service;
	}

	public void setService(List<Service> service) {
		this.service = service;
	}

}
