package by.mk.training.phonestation.dataaccess.filters;

import javax.persistence.metamodel.SingularAttribute;

public class UserFilter {

    private String userName;
    private boolean isFetchCredentials;
    private SingularAttribute sortProperty;
    private boolean sortOrder;
    private Integer offset;
    private Integer limit;

    public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean isFetchCredentials() {
		return isFetchCredentials;
	}
	public void setFetchCredentials(boolean isFetchCredentials) {
		this.isFetchCredentials = isFetchCredentials;
	}
	public SingularAttribute getSortProperty() {
		return sortProperty;
	}
	public void setSortProperty(SingularAttribute sortProperty) {
		this.sortProperty = sortProperty;
	}
	public boolean isSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(boolean sortOrder) {
		this.sortOrder = sortOrder;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
}