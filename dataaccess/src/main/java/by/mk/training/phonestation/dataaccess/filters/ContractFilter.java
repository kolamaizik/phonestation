package by.mk.training.phonestation.dataaccess.filters;

import java.util.Date;

import javax.persistence.metamodel.SingularAttribute;

import by.mk.training.phonestation.datamodel.UserCredentials;
import by.mk.training.phonestation.datamodel.UserProfile;

public class ContractFilter {

	private UserCredentials user;
	private UserProfile userProfile;
	private int phoneNumber;
	private Date dateBegin;
	private Date dateEnd;
	private SingularAttribute sortProperty;
	private boolean sortOrder;
	private Integer offset;
	private Integer limit;

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
	public SingularAttribute getSortProperty() {
		return sortProperty;
	}
	public void setSortProperty(SingularAttribute sortProperty) {
		this.sortProperty = sortProperty;
	}
	public boolean isSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(boolean sortOrder) {
		this.sortOrder = sortOrder;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
}