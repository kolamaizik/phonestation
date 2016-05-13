package by.mk.training.phonestation.dataaccess.impl;

//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaDelete;
//import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import by.mk.training.phonestation.dataaccess.ServiceDao;
import by.mk.training.phonestation.datamodel.Services;
import by.mk.training.phonestation.datamodel.Services_;

@Repository
public class ServiceDaoImpl extends AbstractDaoImpl<Services, Long> implements ServiceDao {

	protected ServiceDaoImpl() {
		super(Services.class);
	}

	@Override
	public void deleteByName(String name) {
/*
		CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
		CriteriaDelete<Services> criteriaDelete = criteriaBuilder.createCriteriaDelete(Services.class);

		Root<Services> root = criteriaDelete.from(Services.class);
		criteriaDelete.where(criteriaBuilder.equal(root.get(Services_.name), name));
		getEntityManager().createQuery(criteriaDelete).executeUpdate();
*/
		System.out.println(Services_.name.getName());
		getEntityManager().createQuery(String.format("delete from %s e where e.%s = :name", getEntityClass().getSimpleName(), Services_.name.getName()))
				.setParameter("name", name).executeUpdate();
	}
}
