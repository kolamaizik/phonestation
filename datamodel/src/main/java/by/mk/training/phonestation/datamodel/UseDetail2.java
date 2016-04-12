package by.mk.training.phonestation.datamodel;

import java.util.Date;

public class UseDetail2 extends AbstractModel {

	private Double quantity;
	private Date period;
	private Date dateUseService;

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Date getPeriod() {
		return period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public Date getDateUseService() {
		return dateUseService;
	}

	public void setDateUseService(Date dateUseService) {
		this.dateUseService = dateUseService;
	}
}
