package by.mk.training.phonestation.datamodel;

import java.util.Date;
import java.util.List;

public class Service extends AbstractModel {
	private String name;
	private List<PhoneNumber> phoneNumber;
	private Date dateBlocked;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PhoneNumber> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<PhoneNumber> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDateBlocked() {
		return dateBlocked;
	}

	public void setDateBlocked(Date dateBlocked) {
		this.dateBlocked = dateBlocked;
	}
}