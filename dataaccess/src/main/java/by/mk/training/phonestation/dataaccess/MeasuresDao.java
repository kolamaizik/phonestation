package by.mk.training.phonestation.dataaccess;

import java.util.List;

import by.mk.training.phonestation.dataaccess.filters.UserFilter;
import by.mk.training.phonestation.datamodel.Measures;

public interface MeasuresDao extends AbstractDao<Measures, Long> {
	List<Measures> find(UserFilter filter);
}