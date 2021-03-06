package com.example.demo.commons.model;

import java.io.Serializable;

public abstract class BaseEntity<ID extends Serializable> implements Serializable {

	public abstract ID getId();

	public abstract Short getVersion();

	@Override
	public String toString() {
		return getClass().getSimpleName() + "{id=" + getId() + "}";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!getClass().isInstance(o)) return false;
		return getId() != null && getId().equals(((BaseEntity<?>) o).getId());
	}

	@Override
	public int hashCode() {
		return 31;
	}
}
