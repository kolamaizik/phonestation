package by.mk.training.phonestation.dataaccess.filters;

import java.util.Date;

import by.mk.training.phonestation.datamodel.UserCredentials;
import by.mk.training.phonestation.datamodel.UserProfile;

public class ContractFilter {

	private UserCredentials user;
	private UserProfile userProfile;
	private int phoneNumber;
	private Date dateBegin;
	private Date dateEnd;

	public UserCredentials getUser() {
		return user;
	}

	public void setUser(UserCredentials user) {
		this.user = user;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
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
}