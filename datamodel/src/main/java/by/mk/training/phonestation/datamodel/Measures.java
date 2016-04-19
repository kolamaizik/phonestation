package by.mk.training.phonestation.datamodel;

import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
public class Measures extends AbstractModel {

	@Column
	private String name;
	@Column
	private Double value;

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
}
