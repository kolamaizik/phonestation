package by.mk.training.phonestation.datamodel;

public class Ats extends AbstractModel {

	private String name;
	private int codeAts;
	private String address;
	private int countNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCodeAts() {
		return codeAts;
	}

	public void setCodeAts(int codeAts) {
		this.codeAts = codeAts;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCountNumber() {
		return countNumber;
	}

	public void setCountNumber(int countNumber) {
		this.countNumber = countNumber;
	}
}
