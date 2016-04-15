
package by.mk.training.phonestation.datamodel;

import java.util.Date;

import javax.persistence.Column;

public class UseDetail extends AbstractModel {

	@Column
	private Double quantity;
	@Column
	private Date dateUseService;
	private ServiceContract serviceContract;

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Date getDateUseService() {
		return dateUseService;
	}

	public void setDateUseService(Date dateUseService) {
		this.dateUseService = dateUseService;
	}

	public ServiceContract getServiceContract() {
		return serviceContract;
	}

	public void setServiceContract(ServiceContract serviceContract) {
		this.serviceContract = serviceContract;
	}
}