package by.mk.training.phonestation.datamodel;

import javax.persistence.Column;

public class Measures extends AbstractModel {

	@Column
	private String name;
	@Column
	private Double value;
	private Service service;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

}
