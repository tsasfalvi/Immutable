package com.immutable;


public class Moon {

	private final Integer size;

	private Moon(Integer size) {
		this.size = size;
	}

	public static Moon newInstance(Integer size) {
		return new Moon(size);
	}

	public Integer getSize() {
		return size;
	}
}
