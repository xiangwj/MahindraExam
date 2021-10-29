package com.selfmap;

import java.util.Objects;

public class ItemData<T,U> {
	T key;
	U value;
	public T getKey() {
		return key;
	}
	public void setKey(T key) {
		this.key = key;
	}
	public U getValue() {
		return value;
	}
	public void setValue(U value) {
		this.value = value;
	}
	@Override
	public int hashCode() {
		return Objects.hash(key);
	}
	public ItemData(T key, U value) {
		super();
		this.key = key;
		this.value = value;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemData other = (ItemData) obj;
		return Objects.equals(key, other.key) && Objects.equals(value, other.value);
	}



}