package by.mk.training.phonestation.datamodel;

public class PhoneNumber {
	private int phoneNumber;
	private UserProfile user;
	private Ats ats;
	private Byte blocked;

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

}
