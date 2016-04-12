package by.mk.training.phonestation.datamodel;

public class Ats extends AbstractModel {

	private String name;
	private int codeAts;
	private String district;
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

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getCountNumber() {
		return countNumber;
	}

	public void setCountNumber(int countNumber) {
		this.countNumber = countNumber;
	}
}
