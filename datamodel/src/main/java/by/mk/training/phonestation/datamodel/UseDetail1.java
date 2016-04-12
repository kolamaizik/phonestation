
package by.mk.training.phonestation.datamodel;

import java.util.Date;

public class UseDetail1 extends AbstractModel {

	private Contract contract;
	private Service service;
	private Double quantity;
	private Date period;
	private Date dateUseService;

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

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