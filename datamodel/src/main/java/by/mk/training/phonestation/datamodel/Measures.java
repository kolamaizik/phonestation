package by.mk.training.phonestation.datamodel;

import javax.persistence.Column;

public class Measures extends AbstractModel {

	@Column
	private String name;
	@Column
	private Double value;

	@OneToMany(mappedBy = "price", fetch = FetchType.LAZY)
	private Price price;

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

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}
}
