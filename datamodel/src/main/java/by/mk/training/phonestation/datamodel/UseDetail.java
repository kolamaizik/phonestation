
package by.mk.training.phonestation.datamodel;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
public class UseDetail extends AbstractModel {

	@Column
	private Double quantity;

	@Column
	private Date dateUseService;

	@ManyToOne(targetEntity = ServiceContract.class, fetch = FetchType.LAZY)
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