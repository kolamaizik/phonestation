package by.mk.training.phonestation.dataaccess.impl;

import org.springframework.stereotype.Repository;

import by.mk.training.phonestation.dataaccess.ServiceDao;
import by.mk.training.phonestation.datamodel.Services;

@Repository 
public class ServiceDaoImpl extends AbstractDaoImpl<Services, Long> implements ServiceDao {

	protected ServiceDaoImpl() {
		super(Services.class);
	}
}
