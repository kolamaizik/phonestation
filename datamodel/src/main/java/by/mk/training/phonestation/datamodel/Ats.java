package by.mk.training.phonestation.datamodel;

public class Ats extends AbstractModel {

	private String name;
	private int code_ats;
	private String address;
	private int countNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode_ats() {
		return code_ats;
	}

	public void setCode_ats(int code_ats) {
		this.code_ats = code_ats;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCount_number() {
		return countNumber;
	}

	public void setCount_number(int count_number) {
		this.countNumber = count_number;
	}

}
