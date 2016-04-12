package by.mk.training.phonestation.datamodel;

public class PhoneNumber extends AbstractModel {

	private int phoneNumber;
	private Ats ats;

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Ats getAts() {
		return ats;
	}

	public void setAts(Ats ats) {
		this.ats = ats;
	}
}