package by.mk.training.phonestation.datamodel;

import java.util.Set;

import javax.persistence.*;

@Entity
public class User extends AbstractModel {

	@Column
	private String email;

	@Column
	private String password;

	@Column
	@Enumerated(EnumType.ORDINAL)
	private UserRole role;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}
}
