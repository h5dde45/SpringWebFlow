package ru.javabegin.training.springwebflow.objects;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 7730377931313245319L;

	private String name;
	private String password;
	
	public User() {
	}

	public User(String name) {
		this.name = name;
	}

	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof User)) return false;

		User user = (User) o;

		if (name != null ? !name.equals(user.name) : user.name != null) return false;
		return password != null ? password.equals(user.password) : user.password == null;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (password != null ? password.hashCode() : 0);
		return result;
	}
}
