package by.mk.training.phonestation.dataaccess;

import java.util.List;

import by.mk.training.phonestation.datamodel.Services;

public interface ServiceDao extends AbstractDao<Services, Long> {
	void deleteByName(String name);
	List<Services> find(Services filter);
	Long count(Services filter);
}
