package by.mk.training.phonestation.dataaccess;

import by.mk.training.phonestation.datamodel.Services;

public interface ServiceDao extends AbstractDao<Services, Long> {
	public void deleteByName(String name);
}
