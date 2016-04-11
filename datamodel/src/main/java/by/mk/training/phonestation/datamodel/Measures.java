package by.mk.training.phonestation.datamodel;

public class Measures extends AbstractModel {

	private Double value;
	private Service service;

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
