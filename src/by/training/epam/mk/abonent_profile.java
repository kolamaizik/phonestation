package by.training.epam.mk;

public class abonent_profile {
	private int id;
	private String email;
	private String first_name;
	private String last_name;
	private String address;
	private String date_born;
	private String date_install;
	private byte blocked;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate_born() {
		return date_born;
	}
	public void setDate_born(String date_born) {
		this.date_born = date_born;
	}
	public String getDate_install() {
		return date_install;
	}
	public void setDate_install(String date_install) {
		this.date_install = date_install;
	}
	public byte getBlocked() {
		return blocked;
	}
	public void setBlocked(byte blocked) {
		this.blocked = blocked;
	}
}
